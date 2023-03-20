package AutomativePackage;

interface Buildable {
    void build();
}

interface Repairable {
    void repair();
}

interface Restorable {
    void restore();
}

public interface AutomativeFactory extends Buildable, Repairable, Restorable {}
