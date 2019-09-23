package 第六章.第五题;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("张三",50);
        map.put("李四",60);
        map.put("王五",70);
        System.out.println(map.entrySet());
        map.put("张三",100);
        System.out.println(map.entrySet());
        Set entrySet=map.entrySet();
        for (Object entry:entrySet){
            Map.Entry e=(Map.Entry)entry;
            System.out.println(e.getKey()+"-----------"+e.getValue());
        }
    }
}
