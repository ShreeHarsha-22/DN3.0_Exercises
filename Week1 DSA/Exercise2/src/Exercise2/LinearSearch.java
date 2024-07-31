package Exercise2;

public class LinearSearch {

    public static Product linearSearch(Product[] products, String targetProductId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetProductId)) {
                return product;
            }
        }
        return null; // If not found
    }

    public static void main(String[] args) {
        // Create sample products
        Product[] products = {
                new Product("001", "Laptop", "Electronics"),
                new Product("002", "Smartphone", "Electronics"),
                new Product("003", "Coffee Maker", "Appliances")
        };

        // Search for a product
        String targetProductId = "002";
        Product result = linearSearch(products, targetProductId);

        if (result != null) {
            System.out.println("Product found: " + result);
        } else {
            System.out.println("Product not found.");
        }
    }
}
