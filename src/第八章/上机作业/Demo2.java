package 第八章.上机作业;

import java.io.*;

public class  Demo2 {
    public static void main(String[] args)throws IOException{
        FileReader reader=new FileReader("D:\\test.txt");
        BufferedReader br=new BufferedReader(reader);
        FileWriter writer=new FileWriter("D:\\test1.txt.");
        BufferedWriter bw=new BufferedWriter(writer);
        String i=br.readLine();//读取一行内容
        i=i.replaceAll("\\{name\\}","欧欧");
        i=i.replaceAll("\\{type\\}","狗狗");
        i=i.replaceAll("\\{master\\}","李伟");
        bw.write(i.toCharArray());
        bw.close();
        reader.close();
        br.close();
        writer.close();

    }
}
