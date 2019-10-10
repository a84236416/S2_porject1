package 练习.第八章练习;

import java.io.*;

public class Demo4 {
    public static void main(String[] args)throws IOException{
        String name="zhangsan";
        int  age=22;
        char c='A';
        String filepath="D:/abc.bin";
        FileOutputStream fos=new FileOutputStream(filepath);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF(name);
        dos.writeInt(age);
        dos.writeChar(c);
        fos.close();
        dos.close();
    }
}
