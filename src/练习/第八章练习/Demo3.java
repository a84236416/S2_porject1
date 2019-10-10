package 练习.第八章练习;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("D:/test.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=null;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        fr.close();
        br .close();
    }
}
