public class Main {
    public static void main(String[] args) {
        Paypal paypal = new Paypal(99.99, "someone@cpp.edu");
        PaymentGateway paymentAdapter = new PaypalAdapter(paypal);
        printPayment(paymentAdapter);
        System.out.println();

        Stripe stripe = new Stripe(67.25, "Some One", "123456789", "04/18");
        PaymentGateway stripeAdapter = new StripeAdapter(stripe);
        printPayment(stripeAdapter);
        System.out.println();

        Square square = new Square(1, "99999");
        PaymentGateway squareGateway = new SquareAdapter(square);
        printPayment(squareGateway);
    }

    public static void printPayment(PaymentGateway gateway) {
        String paymentAmount = gateway.processPayment();
        System.out.println("Payment process via " + paymentAmount);
    }
}
