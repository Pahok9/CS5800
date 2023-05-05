import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Snack> snacks = new HashMap<>();
        snacks.put("Coke", new Snack("Coke", 1, 6));
        snacks.put("Pepsi", new Snack("Pepsi", 2, 5));
        snacks.put("Cheetos", new Snack("Cheetos", 3, 4));
        snacks.put("Doritos", new Snack("Doritos", 4, 3));
        snacks.put("KitKat", new Snack("KitKat", 5, 2));
        snacks.put("Snickers", new Snack("Snickers", 6, 1));

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setSnacks(snacks);

        vendingMachine.selectSnack(snacks.get("Snickers"));
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();

        System.out.println();
        vendingMachine.selectSnack(snacks.get("Pepsi"));
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();

        System.out.println();
        vendingMachine.selectSnack(snacks.get("Snickers"));
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
    }
}
