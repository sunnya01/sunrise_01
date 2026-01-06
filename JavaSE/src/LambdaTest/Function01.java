package LambdaTest;

/**
 * @author sunchaowei
 * @create 2026/1/4-08:50
 */
@FunctionalInterface
public interface Function01 {

    String doSomething(String aa, Integer bb);

    default String doAnother(String cc) {
        return "cc";
    }
}
