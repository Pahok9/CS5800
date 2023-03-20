public class Pizza {
    private String name;
    private String size;
    private String toppings;

    public Pizza(String name, String size, String toppings) {
        this.name = name;
        this.size = size;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Eating " + name + "!");
        System.out.println("Size: " + size);
        System.out.println("Topping(s): " + toppings);
    }
}
