package BasicTest;

import javax.annotation.processing.SupportedAnnotationTypes;

/**
 * 包装类
 */
public class IntegerTest {
    public static void main(String[] args) {

        //1. 包装类与基本类型自动拆装箱
        int i = 10;
        Integer lr_int = 10;
        Integer lr_int2 = i;
        int b = lr_int2;

        //2. String对象与其他包装类或者其他基本类型的互相转换
        //--向内转
        String str = String.valueOf(i);
        //--向外转
        int c = Integer.parseInt(str);

    }
}
