package strategy;

/**
 * 优点： 1、算法可以自由切换。
 * 2、避免使用多重条件判断。
 * 3、扩展性良好。
 *
 * 缺点：
 * 1、策略类会增多。
 * 2、所有策略类都需要对外暴露。
 * */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10+5=" + context.executeStrategy(10,5));
    }
}
