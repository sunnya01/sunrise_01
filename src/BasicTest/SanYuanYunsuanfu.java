package BasicTest;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/*
三元运算符练习
（条件表达式）？  表达式1   ： 表达式2
 布尔类型结果    为真时结果 ： 为假时结果
 */
public class SanYuanYunsuanfu {

    public static void main(String[] args) {
        int lv_m = 1, lv_n = 2, lv_x;
        String lv_str1 = "123";
        String lv_str2 = "1123";
        lv_x = (lv_str1.equals(lv_str2)) ? lv_m : lv_n;
        System.out.println(lv_x);
    }

}
