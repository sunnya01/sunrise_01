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

    SoketSer() throws IOException, InterruptedException {
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
            System.out.println("(判断read方法是否阻塞)正在等待接收:--"+System.currentTimeMillis());
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

}
