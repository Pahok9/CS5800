package AirplanePackage;
import AutomativePackage.AutomativeFactory;

public class AirplaneFactory implements AutomativeFactory {
    private String factoryName;

    public AirplaneFactory(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public void build() {
        System.out.println(factoryName + " built an airplane");
    }

    @Override
    public void repair() {
        System.out.println(factoryName + " repaired an airplane");
    }

    @Override
    public void restore() {
        System.out.println(factoryName + " restored an airplane");
    }
}
