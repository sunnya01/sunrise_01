package TempTest;

import java.io.File;

//创建类 FileCreateTest
public class FileCreate {
    //主方法
    public static void main(String[] args) {
        //创建文件对象
        File file = new File("word.txt");
        if (file.exists()) {
            file.delete();
            System.out.printf("文件已删除" + "\n");
        } else{
            try{
                file.createNewFile();
                System.out.printf("文件已创建"+"\n");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
