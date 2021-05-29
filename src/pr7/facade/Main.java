package pr7.facade;

public class Main {
    public static void main(String... args){
        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdvisor advisor = new RoadAdvisor();


        power.powerOn();

        notifier.downloadRoadInfo();

        advisor.route();

        power.powerOff();
    }
}
