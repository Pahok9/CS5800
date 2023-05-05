public class CheetosDispenseHandler extends SnackDispenseHandler {
    public CheetosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("Cheetos")) {
            if (snack.getQuantity() > 0) {
                snack.decrementQuantity();
                System.out.println("Dispensing a Cheetos.");
            } else {
                System.out.println("Cheetos is out of stock.");
            }
        } else {
            System.out.println("Cheetos handler passed the request.");
            super.dispenseSnack(snack);
        }
    }
}
