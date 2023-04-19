public class Stripe {
    private double paymentAmount;
    private String cardholderName;
    private String cardNumber;
    private String expirationDate;

    public Stripe(double paymentAmount, String cardholderName, String cardNumber, String expirationDate) {
        this.paymentAmount = paymentAmount;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
