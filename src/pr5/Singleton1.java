package pr5;

public enum Singleton1 {
    INSTANCE;

    private Singleton1() {
        System.out.println("First method - enum realisation");
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}

