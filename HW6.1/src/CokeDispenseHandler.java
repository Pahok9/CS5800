public class CokeDispenseHandler extends SnackDispenseHandler {
    public CokeDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("Coke")) {
            if (snack.getQuantity() > 0) {
                snack.decrementQuantity();
                System.out.println("Dispensing a Coke.");
            } else {
                System.out.println("Coke is out of stock.");
            }
        } else {
            System.out.println("Coke handler passed the request.");
            super.dispenseSnack(snack);
        }
    }
}
