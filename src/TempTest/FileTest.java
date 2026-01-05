package TempTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args){
        add();
        File file = new File("word.txt");
        try (FileOutputStream out = new FileOutputStream(file)) {
            //创建byte型数组
            byte buy[] = "你好123,测试文本!".getBytes();
            out.write(buy);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream in = new FileInputStream(file)) {
            byte byt[] = new byte[1024];//创建byte数组
            int len = in.read(byt);//从文件中读取信息
            //将文件中的信息输出
            System.out.printf("文件中的信息是：" + new String(byt, 0, len));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static void add(){
        int a = 1;
        int b = 2;
    }
}
