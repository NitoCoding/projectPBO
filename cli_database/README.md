# Database CLI Application

Created by: Muhammad Ilham Syahfithrah Hendra  
NIM: H071221081

## Description
This CLI application provides a simple interface to interact with a database. It allows you to perform various operations such as listing products, adding new products, updating existing products, and deleting products. The application utilizes a MySQL database and provides a command-line interface for easy interaction.

## Prerequisites
- Java Development Kit (JDK) installed
- MySQL database server installed
- MySQL Connector/J library (JDBC driver) installed

## Setup

1. Clone the repository to your local machine.
2. Import the SQL dump file located in the `database` folder to create the necessary database and tables.
3. Update the database connection details in the `Connector.java` file located in the `utils` package if necessary.
4. Build the application using a Java IDE or command-line tools.
5. Run the `App.java` file to start the application.

## Usage

Upon running the application, you will be presented with the following options:

1. List Products: Displays all products in the database.
2. Add New Product: Allows you to add a new product to the database.
3. Update Product: Allows you to update an existing product in the database.
4. Delete Product: Allows you to delete a product from the database.
0. Exit: Exits the application.

To select an option, enter the corresponding number and press Enter. Follow the prompts and provide the required information for each operation.

Make sure to have the necessary information such as product names, prices, and IDs ready when prompted.

After each operation, the application will provide appropriate feedback and display the results or success messages.

## Layouts

The application consists of the following layouts:

- ProductList: Displays the list of products in a table format.
- AddProductForm: Provides a form for adding a new product.
- UpdateProductForm: Provides a form for updating an existing product.
- DeleteProductForm: Provides a form for deleting a product.

## Controllers

The application utilizes the following controllers:

- ProductController: Handles the logic for retrieving, inserting, updating, and deleting products from the database. It communicates with the database using the Connector class.

## License
This project is licensed under the [MIT License](LICENSE).
