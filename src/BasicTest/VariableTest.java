package BasicTest;
import TempTest.*;
/*
类中属性的实用
属性(成员变量) vs 局部变量
1. 相同点

2.不同点
 */
public class VariableTest {
    public static void main(String[] args) {
        User lr_ut01 = new User();
        lr_ut01.talk("123");
        lr_ut01.age = 13;
        lr_ut01.isMale = true;
    }
}

/*
内部类
 */
 class User {

    //属性
    private String name;
    public int age;
    protected boolean isMale;

    void talk(String language){
        System.out.println(language);
    }

    void eat(){
        String food = "123";
    }

}