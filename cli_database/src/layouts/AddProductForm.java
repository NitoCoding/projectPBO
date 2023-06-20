package layouts;

import java.util.Scanner;

import controllers.ProductController;
import models.Product;

public class AddProductForm {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Add Product Form ===");

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter product price: ");
        int productPrice = scanner.nextInt();

        Product product = null;

        try {
            product = ProductController.insertProduct(productName, productPrice);
            if (product != null) {
                
                System.out.println("Product added successfully!");
                
                System.out.println("Added Product Details:");
                System.out.println("ID: " + product.getProdukId());
                System.out.println("Name: " + product.getProdukName());
                System.out.println("Price: Rp." + product.getProdukPrice());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }


        // scanner.close();
    }
}
