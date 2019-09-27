package 练习.练习1;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Test12 {
    public static void main(String[] args) {
        new Thread("黎"){
         @Override
            public void run(){
             for (int i=0;i<100;i++){
                 if (i==10){
                     Thread.currentThread().start();
                 }
                 System.out.println(Thread.currentThread().getName()+i);
             }
         }
        }.start();

        new Thread("吴"){
            @Override
            public void run(){
                for (int i=0;i<100;i++){
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }.start();
    }
}
