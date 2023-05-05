public class IdleState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(Snack snack) {
        Snack selectedSnack = vendingMachine.getSnacks().get(snack.getName());
        if (selectedSnack != null && selectedSnack.getQuantity() != 0) {
            vendingMachine.setSelectedSnack(selectedSnack);
            System.out.println("Selected snack: " + snack.getName());
            vendingMachine.setState(new AwaitingPaymentState(vendingMachine));
        }
        else if (selectedSnack.getQuantity() == 0) {
            System.out.println("Selected snack is out of stock.");
        }
        else {
            System.out.println("Invalid snack selection.");
        }
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Please select an available snack first.");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please select an available snack first.");
    }
}