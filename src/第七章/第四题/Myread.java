package 第七章.第四题;

public class Myread extends Thread {
    @Override
    public void run(){
        for (int i=1;i<6;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i=1;i<6;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
class Test{
    public static void main(String[] args) {
//        Myread myread=new Myread();
//        myread.start();
        MyRunnable myRunnable=new MyRunnable();
        Thread myTheread=new Thread(myRunnable);
        myTheread.start();

    }
}
