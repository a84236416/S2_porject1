package 第八章.上机作业;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args)throws IOException{
        FileInputStream fis=new FileInputStream("D:\\我的青春谁做主.txt");
        FileOutputStream fos=new FileOutputStream("C:\\maFile\\myPrme.txt");
        int len=0;
        byte[] woeds=new byte[1024];
        while ((len=fis.read(woeds))>0){
           fos.write(woeds,0,len);
        }
        fis.close();
        fos.close();
    }

}
