package pr6.fabricAbstract;

public class FactoryMaker {
    public enum PeripheryType {
        GIG, MSI
    }

    public static HardwareFactory makeFactory(PeripheryType type){
        switch (type) {
            case MSI:
                return new MsiFactory();
            case GIG:
                return new GigabyteFactory();
            default:
                throw new IllegalArgumentException("Type not supported");
        }
    }
}