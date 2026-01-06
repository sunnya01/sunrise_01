package TCPTest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.Scanner;

/**
 * @author sunchaowei
 * @create 2025/12/31-15:40
 */
public class SocketCli {

    SocketCli() throws IOException {

        System.out.println("这里是客户端请您输入即将发送的文字内容:");

        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");

        Socket socket = new Socket(inetAddress, 8899);

        OutputStream outputStream = socket.getOutputStream();

        OutputStreamWriter osw = new OutputStreamWriter(outputStream);

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {

            scanner.hasNext();

            String next = scanner.next();

            osw.write(next);

            osw.flush();

            if (next.contains("e")) break;

        }

        osw.close();

        socket.close();

    }

}
