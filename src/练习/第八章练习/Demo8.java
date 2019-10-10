package 练习.第八章练习;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;


public class Demo8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream is=new FileInputStream("D:/student.ser");
        ObjectInputStream ois=new ObjectInputStream(is);

        List<Student> s= (List<Student>) ois.readObject();
        Iterator it = s.iterator();
        while (it.hasNext()){
           Student sss = (Student)it.next();
           System.out.println(sss.getName());
            System.out.println(sss.getAge());
        }
        ois.close();
        is.close();
    }
}
