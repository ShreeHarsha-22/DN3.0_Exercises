package Exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManager {
    private Map<String, Product> inventory;
    private Scanner scanner;

    public InventoryManager() {
        this.inventory = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    // Add a product
    public void addProduct() {
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(productId, productName, quantity, price);
        inventory.put(productId, product);
        System.out.println("Product added successfully.");
    }

    // Update a product
    public void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        String productId = scanner.nextLine();
        if (inventory.containsKey(productId)) {
            System.out.print("Enter new Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter new Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter new Price: ");
            double price = Double.parseDouble(scanner.nextLine());

            Product updatedProduct = new Product(productId, productName, quantity, price);
            inventory.put(productId, updatedProduct);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product ID not found.");
        }
    }

    // Delete a product
    public void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        String productId = scanner.nextLine();
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product ID not found.");
        }
    }

    // List all products
    public void listProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }

    // Display menu and handle user input
    public void displayMenu() {
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. List Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    listProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.displayMenu();
    }
}
