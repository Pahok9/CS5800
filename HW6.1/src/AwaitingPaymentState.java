public class AwaitingPaymentState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public AwaitingPaymentState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(Snack snack) {
        System.out.println("A snack has already been selected. Please insert money.");
    }

    @Override
    public void insertMoney(int amount) {
        int currentAmount = vendingMachine.getInsertedMoney();
        vendingMachine.setInsertedMoney(currentAmount + amount);
        System.out.println("Inserted $" + amount + ". Total amount: $" + (currentAmount + amount));
        if (vendingMachine.getInsertedMoney() >= vendingMachine.getSelectedSnack().getPrice()) {
            System.out.println("Amount sufficient. Ready to dispense the snack.");
            vendingMachine.setState(new DispensingSnackState(vendingMachine));
        }
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Insufficient amount. Please insert money.");
    }
}
