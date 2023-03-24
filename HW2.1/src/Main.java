import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Pizza Hut
        List<String> pizzaToppings1 = new ArrayList<>(Arrays.asList("Pepperoni", "Olives", "Ham"));
        Pizza pizzaHut1 = new PizzaBuilder().setName("Pizza Hut").setSize("Small").setToppings(pizzaToppings1).makePizza();
        pizzaHut1.eat();
        List<String> pizzaToppings2 = new ArrayList<>(Arrays.asList("Beef", "Extra Cheese", "Bacon", "Mushrooms", "Spinach", "Spicy Pork"));
        Pizza pizzaHut2 = new PizzaBuilder().setName("Pizza Hut").setSize("Medium").setToppings(pizzaToppings2).makePizza();
        pizzaHut2.eat();
        List<String> pizzaToppings3 = new ArrayList<>(Arrays.asList("Mushrooms", "Onions", "Olives", "Spinach", "Tomato and Basil", "Pesto, " +
                "Extra Cheese", "Peppers", "Chicken"));
        Pizza pizzaHut3 = new PizzaBuilder().setName("Pizza Hut").setSize("Large").setToppings(pizzaToppings3).makePizza();
        pizzaHut3.eat();
        List<String> pizzaToppings4 = new ArrayList<>(Arrays.asList("Pepperoni", "Olives", "Ham"));
        Pizza pizzaHut4 = new PizzaBuilder().setName("Pizza Hut").setSize("Large").setToppings(pizzaToppings4).makePizza();
        pizzaHut4.eat();
        List<String> pizzaToppings5 = new ArrayList<>(Arrays.asList("Spicy Pork", "Bacon"));
        Pizza pizzaHut5 = new PizzaBuilder().setName("Pizza Hut").setSize("Small").setToppings(pizzaToppings5).makePizza();
        pizzaHut5.eat();

        // Little Caesars
        List<String> pizzaToppings6 = new ArrayList<>(Arrays.asList("Pepperoni", "Sausage", "Ham", "Pesto", "Peppers", "Chicken", "Extra Cheese", "Spinach"));
        Pizza littleCaesars1 = new PizzaBuilder().setName("Little Caesars").setSize("Medium").setToppings(pizzaToppings6).makePizza();
        littleCaesars1.eat();
        List<String> pizzaToppings7 = new ArrayList<>(Arrays.asList("Beef", "Extra Cheese", "Bacon", "Mushrooms", "Spinach", "Spicy Pork"));
        Pizza littleCaesars2 = new PizzaBuilder().setName("Little Caesars").setSize("Small").setToppings(pizzaToppings7).makePizza();
        littleCaesars2.eat();

        // Dominos
        List<String> pizzaToppings8 = new ArrayList<>(List.of("Chicken"));
        Pizza dominos1 = new PizzaBuilder().setName("Dominos").setSize("Small").setToppings(pizzaToppings8).makePizza();
        dominos1.eat();
        List<String> pizzaToppings9 = new ArrayList<>(Arrays.asList("Ham and Pineapple", "Bacon", "Extra Cheese"));
        Pizza dominos2 = new PizzaBuilder().setName("Dominos").setSize("Large").setToppings(pizzaToppings9).makePizza();
        dominos2.eat();
    }
}
