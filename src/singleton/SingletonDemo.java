package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.show();
    }
}
