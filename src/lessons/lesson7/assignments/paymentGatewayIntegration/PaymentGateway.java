package lessons.lesson7.assignments.paymentGatewayIntegration;

public interface PaymentGateway {
    void processPayment(double amount);
    boolean isPaymentSuccessful();
}
