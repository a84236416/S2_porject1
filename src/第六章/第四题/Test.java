package 第六章.第四题;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst(new Queue("爱奇艺",15));
        list.addFirst(new Queue("优酷",20));
        list.addFirst(new Queue("腾讯会员",10));

        Queue a = (Queue)list.removeLast();//注意，返回值是Object,如果不强转，会报错，原因可能是，java是强类型语言，不能不明确
        System.out.println(a);
        Queue b= (Queue)list.removeLast();
        System.out.println(b);
    }
}
