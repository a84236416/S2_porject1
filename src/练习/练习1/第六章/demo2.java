package 练习.练习1.第六章;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo2 {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("zhangsang");
        set.add("lisi");
        set.add("wangweu");

        set.remove("lisi");
        set.add("zhaoliu");
        System.out.println(set.size());

        Iterator  it=set.iterator();
        while(it.hasNext()){
            String str=(String) it.next();
            System.out.println(str);
        }
    }
}
