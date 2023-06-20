import layouts.ProductManagement;
import utils.Connector;

public class App {
    public static void main(String[] args) throws Exception {
        ProductManagement productManagementCli = new ProductManagement();
        // Connector.getConnection();
        productManagementCli.start();
    }
}
