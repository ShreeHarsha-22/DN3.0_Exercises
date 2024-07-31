package Exercise11;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main class to test the Dependency Injection implementation
public class Main {
    public static void main(String[] args) {
        // Create an instance of CustomerRepositoryImpl
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the CustomerService
        CustomerService customerService = new CustomerService(customerRepository);

        // Fetch and display customer details
        Customer customer = customerService.getCustomerDetails(1);
        System.out.println(customer);
    }
}
