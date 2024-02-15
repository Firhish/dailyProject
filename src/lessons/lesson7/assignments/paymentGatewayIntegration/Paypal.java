package lessons.lesson7.assignments.paymentGatewayIntegration;

public class Paypal implements PaymentGateway {

    private boolean isPaymentSuccessful = false;

    @Override
    public void processPayment(double amount) {
        System.out.printf("Payment amount: RM %.2f, Thank you from paypal\n",amount);
        this.isPaymentSuccessful = true;
    }

    @Override
    public boolean isPaymentSuccessful() {
        return this.isPaymentSuccessful;
    }
    
    
}
