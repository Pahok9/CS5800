import java.util.List;

public class Pizza {
    private String name;
    private String size;
    private List<String> toppings;

    public Pizza(String name, String size, List<String> toppings) {
        this.name = name;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Eating " + name + "!");
        System.out.println("Size: " + size);
        System.out.print("Topping(s):");
        int i = 0;
        for(String t: toppings){
            if(i != 0)
                System.out.print(", " + t);
            else {
                System.out.print(" " + t);
                i++;
            }
        }
        System.out.println();
    }
}
