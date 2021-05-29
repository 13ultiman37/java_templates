package pr6.fabricAbstract;

public class Main {
    public static void main(String[] args) {
        HardwareFactory hardwareFactory = FactoryMaker.makeFactory(FactoryMaker.PeripheryType.MSI);
        Gpu msiGpu = hardwareFactory.createGpu();
        msiGpu.getDescription();
        hardwareFactory = FactoryMaker.makeFactory(FactoryMaker.PeripheryType.GIG);
        Motherboard gigMotherboard = hardwareFactory.createMotherboard();
        gigMotherboard.getDescription();
    }
}
