package 练习.练习1.第六章;

import java.util.ArrayList;
import java.util.List;

public class demo3 {
    public static void main(String[] args) {
        //泛型集合，主要用于约束集合存储的元素的数据类型，减少数据类型转换的代码
        //减少数据类型转换失败的异常发生
        List<String> list=new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        for (String eml : list){
            System.out.println(eml);
        }
    }
}
