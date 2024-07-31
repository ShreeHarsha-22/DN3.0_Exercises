package Exercise11;

// Define the Service class
public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor for Dependency Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Method to get customer details
    public Customer getCustomerDetails(int id) {
        return customerRepository.findCustomerById(id);
    }
}

