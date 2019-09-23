package 练习.练习1.第六章;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;






 class dm{
     public static void main(String[] args) {
         LinkedList <Student> linkedList=new LinkedList<Student>();
         linkedList.add(new Student(1,"张三"));
         linkedList.add(new Student(2,"李四"));
         linkedList.add(new Student(3,"王五"));
         for (Student li :linkedList){
             System.out.println(li.getStuID()+"----"+li.getName());
         }
     }
}
public class demo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(new Student(1,"张三"));
        linkedList.add(new Student(2,"李四"));
        linkedList.add(new Student(3,"王五"));
        Student student=(Student) linkedList.get(0);
        System.out.println(student.getName()+"---"+student.getStuID());
    }
}

