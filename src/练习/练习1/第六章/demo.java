package 练习.练习1.第六章;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(new Student(1,"张三"));
        linkedList.add(new Student(2,"李四"));
        linkedList.add(new Student(3,"王五"));
        Student student=(Student) linkedList.get(1);
        System.out.println(student.getName());
    }
}
