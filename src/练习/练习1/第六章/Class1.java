package 练习.练习1.第六章;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ArrayList ：动态数组（底层就是一个数组来存储数据）
 * 1、存储的是Object类型的元素，所以任何数据都可以装进去
 * 2、长度是可以动态改变的，如果长度不够集合本身会动态自动扩容
 * 3、存储元素是有序的，所以可以通过下标来访问
 */
public class Class1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        //集合的添加
        list.add("张三");
        list.add("李四");
        list.add("王五");

        //集合的修改
        list.set(0,"章事");


        //集合的查找
        String name =(String) list.get(0);
        System.out.println(name);
        //集合的删除
        //list.remove(1);
        //list.clear(); //集合元素
        System.out.println(list.size());//元素的长度

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        //这个更简单
        for(Object obj :list){
            System.out.println(obj );
        }
        System.out.println("------------------------");
        Collections.sort(list);//排序

        for(Object obj :list){
            System.out.println(obj );
        }
    }

}
