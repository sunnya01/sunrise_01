package TempTest;

/**
 * @author sunchaowei
 * @create 2026/1/13-14:07
 */
public class InterFaceTest implements Int001, Int002 {

    /**
     *
     */
    @Override
    public void method02() {
        Int001.super.method02();
        Int002.super.method02();
    }
    static void proxy(){
        Int001.method01();
    }

    public static void main(String[] args) {
        InterFaceTest interFaceTest = new InterFaceTest();
        interFaceTest.method02();
        Int001.method01();
        interFaceTest.method02();
        InterFaceTest.proxy();
    }
}
