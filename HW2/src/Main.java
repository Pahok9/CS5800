import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Pizza Hut
        Pizza pizzaHut1 = new PizzaBuilder().setName("Pizza Hut").setSize("Small").setToppings("Pepperoni, Olives, " +
                "Ham").makePizza();
        pizzaHut1.eat();
        Pizza pizzaHut2 = new PizzaBuilder().setName("Pizza Hut").setSize("Medium").setToppings("Beef, Extra Cheese, " +
                "Bacon, Mushrooms, Spinach, Spicy Pork").makePizza();
        pizzaHut2.eat();
        Pizza pizzaHut3 = new PizzaBuilder().setName("Pizza Hut").setSize("Large").setToppings("Mushrooms, Onions, " +
                "Olives, Spinach, Tomato and Basil, Pesto, Extra Cheese, Peppers, Chicken").makePizza();
        pizzaHut3.eat();
        Pizza pizzaHut4 = new PizzaBuilder().setName("Pizza Hut").setSize("Large").setToppings("Pepperoni, Olives, " +
                "Ham").makePizza();
        pizzaHut4.eat();
        Pizza pizzaHut5 = new PizzaBuilder().setName("Pizza Hut").setSize("Small").setToppings("Spicy Pork, Bacon").makePizza();
        pizzaHut5.eat();

        // Little Caesars
        Pizza littleCaesars1 = new PizzaBuilder().setName("Little Caesars").setSize("Medium").setToppings("Pepperoni, Sausage, " +
                "Ham, Pest, Peppers, Chicken, Extra Cheese, Spinach").makePizza();
        littleCaesars1.eat();
        Pizza littleCaesars2 = new PizzaBuilder().setName("Little Caesars").setSize("Small").setToppings("Bacon, Extra Cheese, " +
                "Pepperoni, Mushrooms, Onions, Spicy Pork").makePizza();
        littleCaesars2.eat();

        // Dominos
        Pizza dominos1 = new PizzaBuilder().setName("Dominos").setSize("Small").setToppings("Chicken").makePizza();
        dominos1.eat();
        Pizza dominos2 = new PizzaBuilder().setName("Dominos").setSize("Large").setToppings("Ham and Pineapple, Bacon, Extra Cheese").makePizza();
        dominos2.eat();
    }
}
