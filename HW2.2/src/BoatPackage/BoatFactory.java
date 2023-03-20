package BoatPackage;
import AutomativePackage.AutomativeFactory;

public class BoatFactory implements AutomativeFactory {
    private String factoryName;

    public BoatFactory(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public void build() {
        System.out.println(factoryName + " built a boat");
    }

    @Override
    public void repair() {
        System.out.println(factoryName + " repaired a boat");
    }

    @Override
    public void restore() {
        System.out.println(factoryName + " restored a boat");
    }
}
