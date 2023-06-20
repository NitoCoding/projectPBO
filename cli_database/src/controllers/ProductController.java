package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Product;
import utils.Connector;

public class ProductController {

    public static ArrayList<Product> getAllProducts() {
        ArrayList<Product> products = new ArrayList<>();

        try {
            Connection connection = Connector.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tb_Products");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int productId = resultSet.getInt("produkId");
                String productName = resultSet.getString("produkName");
                int productPrice = resultSet.getInt("produkPrice");

                Product product = new Product(productId, productName, productPrice);
                products.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    public static Product getProductById(int id) {
        Product product = null;

        try {
            Connection connection = Connector.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tb_Products WHERE produkId = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int productId = resultSet.getInt("produkId");
                String productName = resultSet.getString("produkName");
                int productPrice = resultSet.getInt("produkPrice");

                product = new Product(productId, productName, productPrice);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }

    public static Product insertProduct(String productName, int productPrice) {
        Product product = null;

        try {
            Connection connection = Connector.getConnection();
            PreparedStatement statement = connection
                    .prepareStatement("INSERT INTO tb_products (produkName, produkPrice) VALUES (?, ?)");
            statement.setString(1, productName);
            statement.setInt(2, productPrice);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // ResultSet generatedKeys = statement.getGeneratedKeys();
                // if (generatedKeys.next()) {
                    // int productId = generatedKeys.getInt(1);
                    product = new Product(productName, productPrice);
                    System.out.println("Product added successfully.");
                // }
            // } else {
            //     System.out.println("Failed to add the product.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }

    public static Product updateProduct(int productId, String productName, int productPrice) {
        Product product = null;

        try {
            Connection connection = Connector.getConnection();
            PreparedStatement statement = connection
                    .prepareStatement("UPDATE tb_products SET produkName = ?, produkPrice = ? WHERE produkId = ?");
            statement.setString(1, productName);
            statement.setInt(2, productPrice);
            statement.setInt(3, productId);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Product updated successfully.");
                product = new Product(productId, productName, productPrice);
            } else {
                System.out.println("Failed to update the product.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }

    public static Product deleteProduct(int productId) {
        Product product = null;

        try {
            Connection connection = Connector.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM tb_products WHERE produkId = ?");
            statement.setInt(1, productId);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // System.out.println("Product deleted successfully.");
                product = new Product(productId, "", 0);
            } else {
                System.out.println("Failed to delete the product.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }
}
