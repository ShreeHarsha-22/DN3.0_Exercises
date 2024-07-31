package Exercise2;

import java.util.Arrays;

public class BinarySearch {

    public static Product binarySearch(Product[] products, String targetProductId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midProductId = products[mid].getProductId();

            int comparison = midProductId.compareTo(targetProductId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // If not found
    }

    public static void main(String[] args) {
        // Create and sort sample products
        Product[] products = {
                new Product("001", "Laptop", "Electronics"),
                new Product("002", "Smartphone", "Electronics"),
                new Product("003", "Coffee Maker", "Appliances")
        };

        // Sort products by ID (necessary for binary search)
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        // Search for a product
        String targetProductId = "002";
        Product result = binarySearch(products, targetProductId);

        if (result != null) {
            System.out.println("Product found: " + result);
        } else {
            System.out.println("Product not found.");
        }
    }
}
