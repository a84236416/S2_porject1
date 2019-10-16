package 练习.练习1.多线程;

/**
 * Created by Admin on 2019/10/15.
 */
public class Demo3_Runnadle {
    public static void main(String[] args) {
        MyRunnadle mr=new MyRunnadle();
        //Runnadle target=new MyRunnadle();
        Thread t=new Thread(mr);
        t.start();
        for (int i=0;i<3000;i++){
            System.out.println("bb");
        }
    }
}
class MyRunnadle implements Runnable{
    @Override
    public void run(){
        for (int i=0;i<3000;i++){
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
        }
    }
}