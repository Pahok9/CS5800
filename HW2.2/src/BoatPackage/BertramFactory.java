package BoatPackage;

public class BertramFactory extends BoatFactory{
    private static BertramFactory singletonInstance = null;

    public BertramFactory() {
        super("Bertram");
    }

    public static BertramFactory getInstance() {
        if (singletonInstance == null)
            singletonInstance = new BertramFactory();
        return singletonInstance;
    }
}
