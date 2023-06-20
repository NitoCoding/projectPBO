package layouts;

import java.util.Scanner;

public class ProductManagement {
    private Scanner scanner;

    public ProductManagement() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        String choice;

        do {
            System.out.println("========= Product Management =========");
            System.out.println("1. List Products");
            System.out.println("2. Add New Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Listing all products...");
                    ProductList list = new ProductList();
                    list.start();
                    break;
                case "2":
                    System.out.println("Adding a new product...");
                    AddProductForm addForm = new AddProductForm();
                    addForm.start();
                    break;
                case "3":
                    System.out.println("Updating a product...");
                    UpdateProductForm updateForm = new UpdateProductForm();
                    updateForm.start();
                    break;
                case "4":
                    System.out.println("Deleting a product...");
                    DeleteProductForm deleteForm = new DeleteProductForm();
                    deleteForm.start();
                    break;
                case "0":
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (!choice.equals("0"));

        scanner.close();
    }
}

