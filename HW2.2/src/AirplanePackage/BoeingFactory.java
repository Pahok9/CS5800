package AirplanePackage;

public class BoeingFactory extends AirplaneFactory{
    private static BoeingFactory singletonInstance = null;

    private BoeingFactory() {
        super("Boeing");
    }

    public static BoeingFactory getInstance() {
        if (singletonInstance == null)
            singletonInstance = new BoeingFactory();
        return singletonInstance;
    }
}
