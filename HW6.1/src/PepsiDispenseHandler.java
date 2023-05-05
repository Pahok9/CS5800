public class PepsiDispenseHandler extends SnackDispenseHandler {
    public PepsiDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("Pepsi")) {
            if (snack.getQuantity() > 0) {
                snack.decrementQuantity();
                System.out.println("Dispensing a Pepsi.");
            } else {
                System.out.println("Pepsi is out of stock.");
            }
        } else {
            System.out.println("Pepsi handler passed the request.");
            super.dispenseSnack(snack);
        }
    }
}
