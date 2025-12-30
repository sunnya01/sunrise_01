package TempTest;

import java.io.*;
import java.util.ArrayList;

/**
 * @author sunchaowei
 * @create 2025/12/25-15:10
 */
public class FileTest {

    private static FileOutputStream fileOutputStream;
    private static FileInputStream fileInputStream;
    private static ArrayList<Byte> arrayList;

    public static void main(String[] args) {

        arrayList = new ArrayList<>();

        Byte[] Bytes = new Byte[1000];

        byte[] bytes = new byte[1000];

        int read = 0;

        //1. 文件对象实例化
        File file = new File("picture01.png");

        File fileOut = new File("picture02.png");

        //2. 开启读取流
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在!");
            return;
        }

        do {
            try {
                read = fileInputStream.read(bytes);
                int size = arrayList.size();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (int i = 0; i < read; i++) {
                Bytes[i] = Byte.valueOf(bytes[i]);
                arrayList.add(bytes[i]);
            }
        } while (read > 0);

        //3. 开启写入流
        try {
            fileOutputStream = new FileOutputStream(fileOut);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在!");
        }

        Byte[] array = arrayList.toArray(new Byte[1]);

        byte[] data = new byte[array.length];

        for (int i = 0; i < data.length; i++) {
            data[i] = array[i];
        }

        try {
            fileOutputStream.write(data);
        } catch (IOException e) {
            System.out.println("写入异常!");
        }

        //4. 关闭流
        try {
            fileOutputStream.close();
        } catch (IOException e) {
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
        }

    }

}
