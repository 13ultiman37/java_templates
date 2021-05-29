package pr6.fabricAbstract;

public interface HardwareFactory {
    Motherboard createMotherboard();
    Gpu createGpu();
}