package pr6.fabricAbstract;

public class MsiGpu implements Gpu {
    @Override
    public void getDescription() {
        System.out.println("Msi GPU");
    }
}