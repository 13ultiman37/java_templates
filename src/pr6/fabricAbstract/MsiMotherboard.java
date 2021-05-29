package pr6.fabricAbstract;

public class MsiMotherboard implements Motherboard {
    @Override
    public void getDescription() {
        System.out.println("Msi motherboard");
    }
}
