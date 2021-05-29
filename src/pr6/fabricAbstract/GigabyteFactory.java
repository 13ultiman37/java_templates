package pr6.fabricAbstract;

public class GigabyteFactory implements HardwareFactory {
    @Override
    public Motherboard createMotherboard() {
        return new GigabyteMotherboard();
    }

    @Override
    public Gpu createGpu() {
        return new GigabyteGpu();
    }
}
