package 练习.练习1.多线程;

/**
 * Created by Admin on 2019/10/15.
 */
public class demo {
    public static void main(String[] args) {
        new Thread("黎航领"){
            public void run(){
                for (int i=0;i<1000;i++){
                    System.out.println("aaaaaaaaa");
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    System.out.println("bbbbbbbbbbb");
                }
            }
        }).start();
    }
}
