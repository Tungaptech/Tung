package DesignPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Constructor riêng tư
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}



