package layouts;

import java.util.Scanner;

import controllers.ProductController;
import models.Product;

public class UpdateProductForm {
    private Product foundProduct = null;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Update Product Form ===");
        System.out.print("Enter the product ID to update: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        try {
            foundProduct = ProductController.getProductById(productId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (foundProduct != null) {
            System.out.print("Enter the new product name: ");
            String newProductName = scanner.nextLine();

            System.out.print("Enter the new product price: ");
            int newProductPrice = scanner.nextInt();

            // foundProduct.setProdukName(newProductName);
            // foundProduct.setProdukPrice(newProductPrice);
            try {
                foundProduct = ProductController.updateProduct(productId,newProductName, newProductPrice);
                if (foundProduct != null) {

                    System.out.println("Product added successfully!");

                    System.out.println("Added Product Details:");
                    System.out.println("ID: " + foundProduct.getProdukId());
                    System.out.println("Name: " + foundProduct.getProdukName());
                    System.out.println("Price: Rp." + foundProduct.getProdukPrice());
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        } else {
            System.out.println("Product not found!");
        }

        // scanner.close();
    }
}
