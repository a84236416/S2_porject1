package 练习.练习1.第六章;

import java.util.LinkedList;

class ceshi {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("张三");
        linkedList.add("李四");
        linkedList.add("李四");

        linkedList.addFirst("王五");//把元素加到最前面
        linkedList.addLast("赵六");//把元素加到最末尾
        //linkedList.removeFirst();//删除第一个元素
        //linkedList.removeLast();//删除最后一个元素
        for (Object object :linkedList){
            System.out.println(object);
        }

        System.out.println(linkedList.contains("张三"));//查有没有这个元素
        System.out.println(linkedList.indexOf("李四"));//查是第几个元素
        System.out.println(linkedList.get(0));//打印元素
        System.out.println(linkedList.size());//看元素的长度
    }
}
