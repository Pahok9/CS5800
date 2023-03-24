package CarPackage;

public class TeslaFactory extends CarFactory {
    private static TeslaFactory singletonInstance = null;

    private TeslaFactory() {
        super("Tesla");
    }
    public static TeslaFactory getInstance() {
        if (singletonInstance == null)
            singletonInstance = new TeslaFactory();
        return singletonInstance;
    }
}
