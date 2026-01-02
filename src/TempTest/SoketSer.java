package TempTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sunchaowei
 * @create 2025/12/31-15:41
 */
public class SoketSer {
    public static void main(String[] args) throws IOException {
        System.out.println("这里是服务端以下是外部发送过来的内容:");
        InputStreamReader isr = null;
        InputStream inputStream = null;
        Socket accept = null;
        char[] buffer = new char[10];
        int len;
        int index = 0;
        ServerSocket serverSocket = new ServerSocket(8899);
        accept = serverSocket.accept();
        inputStream = accept.getInputStream();
        isr = new InputStreamReader(inputStream);
        for (; ; ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if ((len = isr.read(buffer)) != -1) {
                String text = new String(buffer, 0, len);
                System.out.println(text);
                if (text.contains("e")) break;
            }
        }
        isr.close();
        accept.close();
        serverSocket.close();
    }

    SoketSer() throws IOException, InterruptedException {
        System.out.println("这里是服务端以下是外部发送过来的内容:");
        InputStreamReader isr = null;
        InputStream inputStream = null;
        Socket accept = null;
        char[] buffer = new char[10];
        int len;
        int index = 0;
        ServerSocket serverSocket = new ServerSocket(8899);
        Thread.sleep(90000);
//        accept = serverSocket.accept();
//        inputStream = accept.getInputStream();
//        isr = new InputStreamReader(inputStream);
//        for (; ; ) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if ((len = isr.read(buffer)) != -1) {
//                String text = new String(buffer, 0, len);
//                System.out.println(text);
//                if (text.contains("e")) break;
//            }
//        }
//        isr.close();
//        accept.close();
//        serverSocket.close();
    }

}
