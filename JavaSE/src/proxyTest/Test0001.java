package proxyTest;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

public class Test0001 implements IntFace01, IntFace02 {

    @Override
    public void print01() {
        System.out.println("本体输出01");
    }

    @Override
    public void print02() {
        System.out.println("本体输出02");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Test0001 tt0001 = new Test0001();
        // 创建InvocationHandler
        Test0002 handler = new Test0002(tt0001);

        Object aa = tt0001.getClass().getInterfaces();

        // 创建代理对象
//        Object proxyInstance = Proxy.newProxyInstance(tt0001.getClass().getClassLoader(),tt0001.getClass().getInterfaces(),handler);
//
//
//        // 先拿到stuProxy的类对象$Proxy0.class
//        Class c = proxyInstance.getClass();
//// 飞
//        Method fly = null;
//        try {
//            fly = c.getDeclaredMethod("print01");
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            fly.invoke(proxyInstance);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }
//// 得100分
//        Method score = null;
//        try {
//            score = c.getDeclaredMethod("print02");
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            score.invoke(proxyInstance);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalArgumentException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }
        Class<Test0001>[] cc = (Class<Test0001>[]) tt0001.getClass().getInterfaces();
        Class<Test0001>[] cc1 = new Class[]{cc[0]};
        IntFace02 proxyInstance = (IntFace02)Proxy.newProxyInstance(tt0001.getClass().getClassLoader(),cc1,handler);
        proxyInstance.print02();
//        proxyInstance.print02();
        // 调用代理对象的方法
//        proxyInstance.print01();
//        proxyInstance.print02();

    }

}

class Test0002 implements InvocationHandler {

    private Object target;

    Test0002(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("执行本体方法之前");

        Object result = method.invoke(target, args);

        System.out.println("执行本体方法之后");

        return null;
    }
}
