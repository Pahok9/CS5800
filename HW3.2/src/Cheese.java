public class Cheese extends Topping {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    public double getCost() {
        return super.getCost() + 0.55;
    }

    public String getDescription() {
        return super.getDescription() + " Cheese";
    }
}
