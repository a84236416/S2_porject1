package 练习.第八章练习;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
Buffer: 缓存，缓冲
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("D:/test.txt",true);//追加内容
        BufferedWriter bw=new BufferedWriter(writer);
         bw.write("同一个世界");
        bw.newLine();  //表示换行
        bw.write("同一个梦想");
        bw.newLine();
        bw.close();
        writer.close();
    }
}
