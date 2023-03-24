package AirplanePackage;

public class EmbraerFactory extends AirplaneFactory{
    private static EmbraerFactory singletonInstance = null;

    private EmbraerFactory() {
        super("Embraer");
    }

    public static EmbraerFactory getInstance() {
        if (singletonInstance == null)
            singletonInstance = new EmbraerFactory();
        return singletonInstance;
    }
}
