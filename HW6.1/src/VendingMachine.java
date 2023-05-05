import java.util.Map;

public class VendingMachine implements StateOfVendingMachine{
    private StateOfVendingMachine state;
    private Map<String, Snack> snacks;
    private Snack selectedSnack;
    private int insertedMoney;
    private final SnackDispenseHandler snackDispenseHandler;

    public VendingMachine() {
        setState(new IdleState(this));
        SnackDispenseHandler snickersHandler = new SnickersDispenseHandler(null);
        SnackDispenseHandler kitkatHandler = new KitKatDispenseHandler(snickersHandler);
        SnackDispenseHandler doritosHandler = new DoritosDispenseHandler(kitkatHandler);
        SnackDispenseHandler cheetosHandler = new CheetosDispenseHandler(doritosHandler);
        SnackDispenseHandler pepsiHandler = new PepsiDispenseHandler(cheetosHandler);
        this.snackDispenseHandler = new CokeDispenseHandler(pepsiHandler);
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public Map<String, Snack> getSnacks() {
        return snacks;
    }

    public void setSnacks(Map<String, Snack> snacks) {
        this.snacks = snacks;
    }

    public Snack getSelectedSnack() {
        return selectedSnack;
    }

    public void setSelectedSnack(Snack selectedSnack) {
        this.selectedSnack = selectedSnack;
    }

    public int getInsertedMoney() {
        return insertedMoney;
    }

    public void setInsertedMoney(int insertedMoney) {
        this.insertedMoney = insertedMoney;
    }

    public SnackDispenseHandler getSnackDispenseHandler() {
        return snackDispenseHandler;
    }

    @Override
    public void selectSnack(Snack snack) {
        state.selectSnack(snack);
    }

    @Override
    public void insertMoney(int amount) {
        state.insertMoney(amount);
    }

    @Override
    public void dispenseSnack() {
        state.dispenseSnack();
    }
}
