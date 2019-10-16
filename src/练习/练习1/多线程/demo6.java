package 练习.练习1.多线程;

/**
 * Created by Admin on 2019/10/15.
 */
public class demo6 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println(getName()+"aaaaa");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2=new Thread(){
          public void run(){
              for (int i=0;i<100;i++){
                  System.out.println(getName()+"bbbb");
                  try {
                      Thread.sleep(10);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
        };
        t1.setDaemon(true);//守护线程不会单独执行，会跟其他线程一起，其他线程结束了他就结束了!!!
        t1.setName("6666");
        t1.start();
        t2.setName("7777");
        t2.start();
    }
}
