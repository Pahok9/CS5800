public class DoritosDispenseHandler extends SnackDispenseHandler {
    public DoritosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("Doritos")) {
            if (snack.getQuantity() > 0) {
                snack.decrementQuantity();
                System.out.println("Dispensing a Doritos.");
            } else {
                System.out.println("Doritos is out of stock.");
            }
        } else {
            System.out.println("Doritos handler passed the request.");
            super.dispenseSnack(snack);
        }
    }
}
