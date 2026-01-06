package TCPTest;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MovieDownload {

    public static void main(String[] args) throws IOException {

        String url = null;
        //输入下载资源地址
        Scanner scanner = new Scanner(System.in);

        msg("请输入需要下载的资源地址(HTTP应用层地址):");

        if (scanner.hasNext())
            url = scanner.next();

        if (!(url.startsWith("http") || url.startsWith("https"))) {
            msg("输入的地址不合理!");
            return;
        } else {
            scanner.close();
            msg("地址获取完毕关闭控制台输入流!");
        }
        //1. 获取URL对象
        URL lr_url = new URL(url);//https://ftp.yz.yamagata-u.ac.jp/pub/eclipse/oomph/epp/2025-12/R/eclipse-inst-jre-win64.exe

        //2. 建立连接
        HttpURLConnection urlConnection = (HttpURLConnection) lr_url.openConnection();

//        urlConnection.setRequestMethod("POST");

//        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        urlConnection.setRequestMethod("GET");

        urlConnection.addRequestProperty("User-Agent", "Mozilla/4.0");

        urlConnection.connect();

        //3. 得到输入字节流
        InputStream inputStream = urlConnection.getInputStream();

        //4. 使用缓冲处理流包装
        BufferedInputStream bis = new BufferedInputStream(inputStream);

        //5. 启用输出字节流下载到本地
        File file = new File("xtlbb-jd-3.71.7215-3.71.7227.exe");

        FileOutputStream fos = new FileOutputStream(file);

        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] buff = new byte[1024];

        int len;

        //6. 开始下载
        while ((len = bis.read(buff)) != -1) {
            bos.write(buff, 0, len);
        }

        //7. 关闭
        bos.close();

        bis.close();

        urlConnection.disconnect();

    }

    static public void msg(String value) {
        System.out.println(value);
    }

}
