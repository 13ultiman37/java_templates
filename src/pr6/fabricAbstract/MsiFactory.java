package pr6.fabricAbstract;

public class MsiFactory implements HardwareFactory {
    @Override
    public Motherboard createMotherboard() {
        return new MsiMotherboard();
    }

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}