package BasicTest;

import java.io.PrintStream;
/*
实例对象时的重写，本质实例化的继承了该类的子类，{}内部重写的方法相当于在匿名子类中重写了这个方法
System.setOut()类似与abap中的事件绑定，即把当前重写的方法通过PS实例对象绑定到println方法中
 */
public class ChongXieTest {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println(a + "123" + b);
        System.out.println(a + b);
    }

    static void method(int a, int b) {

        PrintStream lr_ps = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                if (x.equals("a=10")) {
                    x = "a=100";
                } else if (x.equals("b=10")) {
                    x = "b=200";
                }
                super.println(x);
            }
        };
        System.setOut(lr_ps);
    }
}

