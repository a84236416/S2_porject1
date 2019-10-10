package 练习.第八章练习;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo7 {
    public static void main(String[] args)throws IOException {
        Student stu=new  Student("zhangsan",22);
        Student stu2=new Student("lisi",22);
        Student stu3=new Student("wangwu",23);
        List<Student> list=new ArrayList<Student>();
        list.add(stu);
        list.add(stu2);
        list.add(stu3);

        OutputStream os=new FileOutputStream("D:/student.ser");
        ObjectOutputStream oos=new ObjectOutputStream(os);
        oos.writeObject(list);
        oos.close();
        os.close();
    }
}
