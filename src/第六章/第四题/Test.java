package 第六章.第四题;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst(new Queue("爱奇艺",15));
        list.addFirst(new Queue("优酷",20));
        list.addFirst(new Queue("腾讯会员",10));
        for (Object object :list){
            System.out.println(object);
        }
    }
}
