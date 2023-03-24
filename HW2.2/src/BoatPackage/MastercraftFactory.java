package BoatPackage;

public class MastercraftFactory extends BoatFactory {
    private static MastercraftFactory singletonInstance = null;

    private MastercraftFactory() {
        super("Mastercraft");
    }

    public static MastercraftFactory getInstance() {
        if (singletonInstance == null)
            singletonInstance = new MastercraftFactory();
        return singletonInstance;
    }
}
