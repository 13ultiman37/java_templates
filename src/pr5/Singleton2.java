package pr5;

public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){
        System.out.println("Second method - lazy realisation");
    }

    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
            return instance;
        }
        return instance;
    }
}