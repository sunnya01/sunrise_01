package TempTest;

/**
 * @author sunchaowei
 * @create 2026/1/13-14:07
 */
public interface Int001 {
    static void method01(){
        System.out.println("001接口的静态方法");
    }

    default void method02(){
        System.out.println("001接口的默认实例方法");
        method03();
    }

    private void method03(){
        System.out.println("001接口中的默认实例私有方法");
    }
}
