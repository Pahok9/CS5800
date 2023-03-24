package CarPackage;

public class PorscheFactory extends CarFactory {
    private static PorscheFactory singletonInstance = null;

    private PorscheFactory() {
        super("Porsche");
    }

    public static PorscheFactory getInstance() {
        if (singletonInstance == null)
            singletonInstance = new PorscheFactory();
        return singletonInstance;
    }
}
