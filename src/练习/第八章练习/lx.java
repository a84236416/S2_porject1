package 练习.第八章练习;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lx {
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("D://aaa.txt");
        FileOutputStream fos=new FileOutputStream("D://aaa.txt");
        int b;
        while ((b=fis.read())!=-1){
            System.out.println(b);
        }
        fis.close();
        fos.close();
    }

}
