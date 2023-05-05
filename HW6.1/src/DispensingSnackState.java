public class DispensingSnackState implements StateOfVendingMachine{
    private VendingMachine vendingMachine;

    public DispensingSnackState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(Snack snack) {
        vendingMachine.setSelectedSnack(snack);
        System.out.println("Please wait! Dispensing the snack.");
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Please wait! Dispensing the snack.");
    }

    @Override
    public void dispenseSnack() {
        Snack snack = vendingMachine.getSelectedSnack();
        vendingMachine.getSnackDispenseHandler().dispenseSnack(snack);
        vendingMachine.setState(new IdleState(vendingMachine));
        vendingMachine.setSelectedSnack(null);
        vendingMachine.setInsertedMoney(vendingMachine.getInsertedMoney() - snack.getPrice());
    }
}
