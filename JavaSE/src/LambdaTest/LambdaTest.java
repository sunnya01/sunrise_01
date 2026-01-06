package LambdaTest;

import java.io.PrintStream;

/**
 * @author sunchaowei
 * @create 2026/1/4-08:50
 */
public class LambdaTest {

    public static void main(String[] args) {

        test(new Function01() {
            @Override
            public String doSomething(String aa, Integer bb) {
                return "传统的";
            }
        });

        test((String x1, Integer x2) -> {return "lambdafull";});

        test(( x1,  x2)->"lambdaeasy");

        test(Doer::hiHi2);

        Doer doer = new Doer();

        test(doer::hiHi);

        test(doer::doSomething);

        PrintStream os = System.out;

        test02(os::println);

        test02(System.out::println);

        /*
        总结:
        1. 只要参数相同就可以进行方法引用
        2. lambda表达式->符号左边表示接口抽象方法参数 右边表示具体方法体
        3. 如果方法参数只有一个可以去掉括号例如 (String x1) = String x1 参数类型可以从接口抽象方法推断因此类型也可以省略 String x1 = x1
        4. 方法体如果只有一句代码可以去掉大括号和可能存在的return语句但是";"需要保留 例如 { return new String("返回字符串"); } = new String("返回字符串");
        5. 因此简写后 x1 -> new String("返回字符串");
        6. 方法引用: "::"符号左边表示实现引用的对象,对于静态方法它表示类型名称,对于实例方法它表示类型的实例对象,引用的方法与接口的抽象方法参数和返回值类型必须相同
         */

    }

    public static void test(Function01 fcc) {
        System.out.println(fcc.doSomething("你好", 30));
    }
    public static void test02(printIf pp){
    }

}

class Doer implements Function01 {
    /**
     * @param aa
     * @param bb
     * @return
     */
    @Override
    public String doSomething(String aa, Integer bb) {
        return "接口实现方法";
    }

    public String hiHi(String cc, Integer dd) {
        return "实例同参方法";
    }

    public static String hiHi2(String cc, Integer dd) {
        return "静态同参方法";
    }
}