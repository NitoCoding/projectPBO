package layouts;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.ProductController;
import models.Product;

public class ProductList {
    private ArrayList<Product> productList;

    public ProductList() {
        this.productList = ProductController.getAllProducts();
    }

    public void start() {

        System.out.println("ID\t\tName\t\tPrice");
        System.out.println("------------------------------------");

        if (productList.isEmpty()) {
            System.out.println("No data inserted yet.");
        } else {
            for (Product product : productList) {
                System.out.format("%d\t%s\t\tRp.%d%n", product.getProdukId(), product.getProdukName(),
                        product.getProdukPrice());
            }
        }

    }
}
