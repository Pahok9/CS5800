public class Pickle extends Topping {
    public Pickle(FoodItem foodItem) {
        super(foodItem);
    }

    public double getCost() {
        return super.getCost() + 0.25;
    }

    public String getDescription() {
        return super.getDescription() + " Pickle";
    }
}
