package 第六章.上机练习;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
      Map  coutries=new HashMap();
      coutries.put("CN","中华人民共和国");
      coutries.put("RU","俄罗斯联邦");
        coutries.put("FR","法兰西共和国");
        coutries.put("US","美利坚合众国");
        coutries.put("JP","小日本帝国");

        String  country=(String) coutries.get("CN");//用键找值
        System.out.println("CN对应的国家是："+country);
        System.out.println("Map中共有"+coutries.size()+"组数据");//输出它的长度
        System.out.println("Map中包含FR的key吗？"+coutries.containsKey("FR"));//判断它是不是存在！！！
        coutries.remove("FR");
        System.out.println("Map中包含FR的key吗？"+coutries.containsKey("FR"));//跟上面一样
        System.out.println(coutries.keySet()+"==========="+coutries.values());//输出它的键值！！！！
        System.out.println(coutries);
        coutries.clear();
        if (coutries.isEmpty()){
            System.out.println("已清空Map中的数据");
        }


    }
}
