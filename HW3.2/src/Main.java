public class Main {
    public static void main(String[] args) {
        FoodItem burger = new Cheese(new Pickle(new Bacon(new Burger())));
        FoodItem fries = new Fries();
        FoodItem drink = new Drinks();

        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(drink);

        double orderTotal = order.getTotalCost();
        LoyaltySystem loyaltyDiscount = new LoyaltySystem();
        int discountInPercent = 10;
        double discountedTotal = loyaltyDiscount.applyDiscount(orderTotal, discountInPercent);

        System.out.println("Food Order: ");
        order.printItemsOrdered();
        System.out.println("Total: $" + orderTotal);
        System.out.println("Discount: " + discountInPercent  + "%");
        System.out.println("Discounted total: $" + discountedTotal);
    }
}
