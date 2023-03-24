package AirplanePackage;

public class AirbusFactory extends AirplaneFactory{
    private static AirbusFactory singletonInstance = null;

    private AirbusFactory() {
        super("Airbus");
    }

    public static AirbusFactory getInstance() {
        if (singletonInstance == null)
            singletonInstance = new AirbusFactory();
        return singletonInstance;
    }
}
