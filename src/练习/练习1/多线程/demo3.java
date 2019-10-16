package 练习.练习1.多线程;

/**
 * Created by Admin on 2019/10/15.
 */
public class demo3 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(this.getName()+"aaaaa");
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                for (int i=0;i<1000;i++){
                    System.out.println(this.getName()+"bbbbb");
                }
            }
        };
        t1.setName("时王");
        t2.setName("逢魔时王");
        t1.start();
        t2.start();
    }


}
