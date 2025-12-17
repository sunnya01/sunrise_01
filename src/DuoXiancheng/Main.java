package DuoXiancheng;// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入一个整数：");
//        int num = scanner.nextInt();
//        System.out.println("输入的整数是：" + num);
//        scanner.close();
//        System.out.println("测试print输出!");
//        System.out.println( "123" );
        Son son = new Son();
        son.i = 100;
        son.c = 100;
        son.z = 99;
        System.out.println(son.getFI());
        System.out.println(son.getI());

    }
}
