package BoatPackage;

public class SeaRayFactory extends BoatFactory{
    private static SeaRayFactory singletonInstance = null;

    private SeaRayFactory() {
        super("SeaRay");
    }

    public static SeaRayFactory getInstance() {
        if (singletonInstance == null)
            singletonInstance = new SeaRayFactory();
        return singletonInstance;
    }
}
