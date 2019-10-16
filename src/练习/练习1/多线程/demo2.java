package 练习.练习1.多线程;

/**
 * Created by Admin on 2019/10/15.
 */
public class demo2 {
    public static void main(String[] args) {
        new Thread("黎"){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println(this.getName()+"aaaaaaaa");
                }
            }
        }.start();
        new Thread("李"){
            public void run(){
                for (int i=0;i<1000;i++){
                    System.out.println(this.getName()+"bbbbb");
                }
            }
        }.start();
    }
}
