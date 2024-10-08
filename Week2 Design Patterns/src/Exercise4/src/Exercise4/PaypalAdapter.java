package Exercise4;

public class PaypalAdapter implements PaymentProcessor {
    private PaypalPaymentGateway paypalPaymentGateway;

    public PaypalAdapter(PaypalPaymentGateway paypalPaymentGateway) {
        this.paypalPaymentGateway = paypalPaymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        paypalPaymentGateway.makePayment(amount);
    }
}

