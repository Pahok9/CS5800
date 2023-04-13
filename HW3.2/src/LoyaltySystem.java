public class LoyaltySystem {
    public double applyDiscount(double orderTotal, double discountPercentage) {
        return orderTotal - (orderTotal * discountPercentage / 100);
    }
}
