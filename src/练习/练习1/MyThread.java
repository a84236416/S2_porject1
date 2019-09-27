package 练习.练习1;

public class MyThread extends Thread {
    @Override
    public  void run(){
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+""+i);
        }
    }
}
class Test10{
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        for (int i=0;i<200;i++){
            System.out.println("--------------------");
        }
    }
}
