import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<FoodItem> itemsOrdered;
    private double totalCost;

    public Order() {
        itemsOrdered = new ArrayList<>();
        totalCost = 0;
    }

    public void addItem(FoodItem item) {
        itemsOrdered.add(item);
        totalCost += item.getCost();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void printItemsOrdered() {
        String[] splitItem;
        for(FoodItem item: itemsOrdered) {
            splitItem = item.getDescription().split(" ", 2);
            System.out.println(splitItem[0] + " $" + item.getCost());
            if(splitItem.length > 1)
                System.out.println("Topping(s): " + splitItem[1]);
        }

    }
}
