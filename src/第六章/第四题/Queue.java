package 第六章.第四题;

public class Queue {
String name;
int  price;
public Queue(String name ,int price){
    this.name=name;
    this.price=price;
}
    public String toString(){
        return "视频软件"+name+"会员价"+price;
        /*
         * 一直有个误区是，可以直接输出对象，后来才知道直接输出对象是包名类名哈希值，所以要重写ToString
         */
    }
}
