package Exercise3;

public class QuickSortOrders {

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        // Swap orders[i + 1] and orders[high]
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        // Create sample orders
        Order[] orders = {
                new Order("001", "Alice", 250.00),
                new Order("002", "Bob", 150.00),
                new Order("003", "Charlie", 300.00)
        };

        // Sort orders using Quick Sort
        quickSort(orders, 0, orders.length - 1);

        // Print sorted orders
        System.out.println("Orders sorted by total price (Quick Sort):");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
