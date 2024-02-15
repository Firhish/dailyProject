package lessons.lesson7.assignments.paymentGatewayIntegration;

public class Main {
    public static void main(String[] args) {
        Stripe stripe = new Stripe();
        Paypal paypal = new Paypal();

        
        stripe.processPayment(20.45);

        if(stripe.isPaymentSuccessful())
            System.out.println("Payment Successful!");
        else
            System.out.println("Payment Failed!");

        paypal.processPayment(47.90);

        if(paypal.isPaymentSuccessful())
            System.out.println("Payment Successful!");
        else
            System.out.println("Payment Failed!");
    }
    
}
