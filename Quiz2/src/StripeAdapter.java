public class StripeAdapter implements PaymentGateway{
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public String processPayment() {
        return "Stripe payment: $" + stripe.getPaymentAmount() + "\nCardholder name: " + stripe.getCardholderName() +
                "\nCard Number: " + stripe.getCardNumber() + "\nExp Date: " + stripe.getExpirationDate();
    }
}
