package 练习.第八章练习;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:/1.jpg");
        FileOutputStream fos=new FileOutputStream("D:/ABC/2.jpg");
        byte[] bs=new byte[1024];
        int  len=0;
        while ((len=fis.read(bs))>0){
            System.out.println("------有数据-----"+len  );
            fos.write(bs,0,len);
        }
        fos.close();
        fis.close();
    }
}
