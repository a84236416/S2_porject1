package 练习.第八章练习;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("D:/abc.bin");
        DataInputStream dis=new DataInputStream(fis);
         String name=dis.readUTF();
         int age=dis.readInt();
         char c=dis.readChar();
        System.out.println(name);
        System.out.println(age);
        System.out.println(c);
        fis.close();
        dis.close();
    }
}
