package Exercise11;
import java.util.*;
// Implement the Repository interface
public class CustomerRepositoryImpl implements CustomerRepository {

    // Sample data store
    private static final Map<Integer, Customer> customerDataStore = new HashMap<>();

    // Static block to initialize sample data
    static {
        customerDataStore.put(1, new Customer(1, "John Doe", "john.doe@example.com"));
        customerDataStore.put(2, new Customer(2, "Jane Smith", "jane.smith@example.com"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerDataStore.get(id);
    }
}

