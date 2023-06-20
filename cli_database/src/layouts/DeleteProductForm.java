package layouts;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.ProductController;
import models.Product;

public class DeleteProductForm {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        Product productFound = null;

        // Assume productList contains existing products

        System.out.println("=== Delete Product Form ===");
        System.out.print("Enter the product ID to delete: ");
        int productId = scanner.nextInt();

        try {
            productFound = ProductController.getProductById(productId);
            
            if (productFound != null) {
                ProductController.deleteProduct(productId);
                System.out.println("Product deleted successfully!");
            } else {
                System.out.println("Product not found!");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }


        // scanner.close();
    }
}
