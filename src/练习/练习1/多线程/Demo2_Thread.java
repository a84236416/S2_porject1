package 练习.练习1.多线程;
/**
 * Created by Admin on 2019/10/15.
 */
public class Demo2_Thread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        for (int i=0;i<3000;i++){
            System.out.println("bb");
        }
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i=0;i<3000;i++){
            System.out.println("aaaaaaaaaaaaaaaaaaaaa");
        }
    }
}