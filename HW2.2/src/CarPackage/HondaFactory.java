package CarPackage;

public class HondaFactory extends CarFactory {
    private static HondaFactory singletonInstance = null;

    private HondaFactory() {
        super("Honda");
    }

    public static HondaFactory getInstance() {
        if (singletonInstance == null)
            singletonInstance = new HondaFactory();
        return singletonInstance;
    }
}
