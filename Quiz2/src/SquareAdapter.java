public class SquareAdapter implements PaymentGateway {
    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public String processPayment() {
        return "Square payment: $" + square.getPaymentAmount() + "\nLocation ID: " + square.getLocationID();
    }
}
