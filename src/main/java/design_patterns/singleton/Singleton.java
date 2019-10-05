package design_patterns.singleton;

public class Singleton {

    private static Singleton instance;

    private Object data;

    private Singleton() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
