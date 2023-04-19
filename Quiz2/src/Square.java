public class Square {
    private double paymentAmount;
    private String locationID;

    public Square(double paymentAmount, String locationID) {
        this.paymentAmount = paymentAmount;
        this.locationID = locationID;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getLocationID() {
        return locationID;
    }
}
