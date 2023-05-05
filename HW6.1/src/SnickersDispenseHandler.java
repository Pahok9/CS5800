public class SnickersDispenseHandler extends SnackDispenseHandler {
    public SnickersDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("Snickers")) {
            if (snack.getQuantity() > 0) {
                snack.decrementQuantity();
                System.out.println("Dispensing a Snickers.");
            } else {
                System.out.println("Snickers is out of stock.");
            }
        } else {
            System.out.println("Snickers handler passed the request.");
            super.dispenseSnack(snack);
        }
    }
}
