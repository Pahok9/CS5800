public class PaypalAdapter implements PaymentGateway {
    private Paypal paypal;

    public PaypalAdapter(Paypal payPal) {
        this.paypal = payPal;
    }

    @Override
    public String processPayment() {
        return "Paypal payment: $" + paypal.getPaymentAmount() + "\nUser email: " + paypal.getUserEmail();
    }
}
