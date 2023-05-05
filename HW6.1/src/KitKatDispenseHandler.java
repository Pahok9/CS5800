public class KitKatDispenseHandler extends SnackDispenseHandler {
    public KitKatDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("KitKat")) {
            if (snack.getQuantity() > 0) {
                snack.decrementQuantity();
                System.out.println("Dispensing a KitKat.");
            } else {
                System.out.println("KitKat is out of stock.");
            }
        } else {
            System.out.println("KitKat handler passed the request.");
            super.dispenseSnack(snack);
        }
    }
}
