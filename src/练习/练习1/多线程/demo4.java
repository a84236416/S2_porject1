package 练习.练习1.多线程;

/**
 * Created by Admin on 2019/10/15.
 */
public class demo4 {
    public static void main(String[] args) {
     new Thread(new Runnable() {
         @Override
         public void run() {
             for (int i=0;i<100;i++){
                 System.out.println(Thread.currentThread().getName()+"aaaaaa");
             }
         }
     }).start();

     new  Thread(new Runnable() {
         @Override
         public void run() {
             for (int i=0;i<100;i++){
                 System.out.println(Thread.currentThread().getName()+"bbbbbb");
             }
         }
     }).start();
     Thread.currentThread().setName("我是主线程");
        System.out.println(Thread.currentThread().getName());
    }
}
