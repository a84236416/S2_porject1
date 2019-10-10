package 练习.练习1;

public class Demo {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        //改线程的名字
        t.setName("主线程");
        System.out.println(t.getName());
        System.out.println(t.isAlive());

    }
}
