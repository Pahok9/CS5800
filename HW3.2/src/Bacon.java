public class Bacon extends Topping{
    public Bacon(FoodItem foodItem) {
        super(foodItem);
    }

    public double getCost() {
        return super.getCost() + 1.00;
    }

    public String getDescription() {
        return super.getDescription() + " Bacon";
    }
}
