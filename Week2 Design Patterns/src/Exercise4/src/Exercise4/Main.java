package Exercise4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create instances of the third-party gateways
        PaypalPaymentGateway paypalGateway = new PaypalPaymentGateway();
        StripePaymentGateway stripeGateway = new StripePaymentGateway();

        // Create adapters for each payment gateway
        PaymentProcessor paypalProcessor = new PaypalAdapter(paypalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        // Process payments using the adapters
        paypalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(200.0);
    }
}
