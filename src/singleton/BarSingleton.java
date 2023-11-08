package singleton;

public class BarSingleton {
    private static BarSingleton instance;

    private BarSingleton() { 
    }

   
    public static BarSingleton getInstance() {
        if (instance == null) {
            instance = new BarSingleton();
        }
        return instance;
    }

    public void servirBebida(String bebida) {
        System.out.println("Sirviendo " + bebida);
    }
}
