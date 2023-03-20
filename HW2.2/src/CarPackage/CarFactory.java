package CarPackage;
import AutomativePackage.AutomativeFactory;

public class CarFactory implements AutomativeFactory {
    private String factoryName;

    public CarFactory(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public void build() {
        System.out.println(factoryName + " built a car");
    }

    @Override
    public void repair() {
        System.out.println(factoryName + " repaired a car");
    }

    @Override
    public void restore() {
        System.out.println(factoryName + " built a car");
    }
}
