package BasicTest;

/*
本身在栈空间存在即使没有在堆空间存在对应内存空间分配也不会引发空指针异常
本身已经是null了但是代码中还在访问不存在的堆空间的地址在栈中的变量引用则触发空指针异常
 */
public class ExceptionTest {
    ExceptionTest() {
        gr_sub01 = new ExceptionSub();
    }

    ExceptionSub gr_sub01;

    public static void main(String[] args) {

        ExceptionTest lr_exc01 = new ExceptionTest();
        System.out.println(lr_exc01.gr_sub01.gv_str);

    }
}

class ExceptionSub {
    String gv_str;
}
