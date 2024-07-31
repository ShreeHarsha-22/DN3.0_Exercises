package Exercise3;

public class BubbleSortOrders {

    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    // Swap orders[j] and orders[j + 1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create sample orders
        Order[] orders = {
                new Order("001", "Alice", 250.00),
                new Order("002", "Bob", 150.00),
                new Order("003", "Charlie", 300.00)
        };

        // Sort orders using Bubble Sort
        bubbleSort(orders);

        // Print sorted orders
        System.out.println("Orders sorted by total price (Bubble Sort):");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

