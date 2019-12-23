package singleton;

public class SingleObject {
    // 实例
    private static SingleObject instance = new SingleObject();
    // private构造函数
    private SingleObject(){}
    // 获取实例
    public static SingleObject getInstance(){
        return instance;
    }
    // 测试方法
    public void show(){
        System.out.println("ss");
    }
}
