package 练习.练习1.第六章;

import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        Map  map=new HashMap();
        map.put("1000","zhangsan");
        map.put("1001","lisi");
        map.put("1002","wangwu");
        map.put("1003","zhaoliu");
        System.out.println(map.size());
        map.remove("1000");

        System.out.println(map.size());
        Set entrySet=map.entrySet();
        for (Object entry:entrySet){
            Map.Entry e=(Map.Entry)entry;
            System.out.println(e.getKey()+"-----------"+e.getValue());
        }

//        Set keys=map.keySet 56();//先获取map中的所有key
//        Iterator it=keys.iterator();   //["1000",["10001"],["10002"],["10003"]]
//        while (it.hasNext()){
//            String key=(String) it.next();
//            System.out.println(key+"----------"+map.get(key));
//        }
//

    }
}
