public class Paypal {
    private double paymentAmount;
    private String userEmail;

    public Paypal(double paymentAmount, String userEmail) {
        this.paymentAmount = paymentAmount;
        this.userEmail = userEmail;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
