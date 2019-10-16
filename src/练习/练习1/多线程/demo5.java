package 练习.练习1.多线程;

/**
 * Created by Admin on 2019/10/15.
 */
public class demo5 {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                for (int i=0;i<100;i++){
                    System.out.println(getName()+"aaaaa");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new  Thread(){
            public void run(){
                for (int i=0;i<100;i++){
                    System.out.println(getName()+"bbbbb");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
