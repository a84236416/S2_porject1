package 练习.练习1.多线程;

/**
 * Created by Admin on 2019/10/15.
 */
public class demo7 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
        public void run(){
          for (int i=0;i<50;i++){
              System.out.println(getName()+"aaaa");
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        }
        };

        Thread t2=new Thread(){
            @Override
            public void run(){
                for (int i=0;i<50;i++){
                    if (i==5){
                        try{
                            //t1.join();
                            t1.join(30);
                            Thread.sleep(1000);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName()+"bbbbb");
                }
            }
        };
           t1.start();
           t2.start();
    }
}
