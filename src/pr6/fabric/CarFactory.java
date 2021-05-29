package pr6.fabric;

public class CarFactory {
    public static Worker getWorker(String type){
        if (type.equals("Model1")){
            return new Model1Worker();
        }
        else {
            return new Model2Worker();
        }
    }
}
