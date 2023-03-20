public class PizzaBuilder {
    private String name;
    private String size;
    private String toppings;

    public PizzaBuilder() {
    }

    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza makePizza() {
        return new Pizza(name, size, toppings);
    }
}
