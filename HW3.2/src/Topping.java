public class Topping implements FoodItem {
    protected FoodItem topping;

    public Topping(FoodItem topping) {
        this.topping = topping;
    }

    public double getCost() {
        return topping.getCost();
    }

    public String getDescription() {
        return topping.getDescription();
    }
}
