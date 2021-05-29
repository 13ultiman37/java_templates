package pr6.fabric;

public class Main {
    public static void main(String[] args) {
        Worker model1 = CarFactory.getWorker("Model1");
        Worker model2 = CarFactory.getWorker("Model2");
        model1.buildingCar();
        model2.buildingCar();
    }
}
