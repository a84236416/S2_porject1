package 第八章.上机作业;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("C:\\1.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\maDoc\\myPicture.bmp");
        int len=0;
        byte[] bs= new byte[1024];
        while ((len=fis.read(bs))>0){
            fos.write(bs,0,len);
        }
        fis.close();
        fos.close();
    }
}
