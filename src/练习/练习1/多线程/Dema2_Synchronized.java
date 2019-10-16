package 练习.练习1.多线程;

/**
 * Created by Admin on 2019/10/15.
 */
public class Dema2_Synchronized {
    public static void main(String[] args) {
       TicketsSeller t1=new TicketsSeller();
        TicketsSeller t2=new TicketsSeller();
        TicketsSeller t3=new TicketsSeller();
        TicketsSeller t4=new TicketsSeller();

        t1.setName("窗空1");
        t2.setName("窗空2");
        t3.setName("窗空3");
        t4.setName("窗空4");



        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class TicketsSeller extends Thread{
    private static int tickets=1000;
    static Object obj=new Object();
    public TicketsSeller(){
        super();
    }
    public TicketsSeller(String name){
        super(name);
    }
    public void run(){
        while (true){
            synchronized (obj){
                if (tickets<=0){
                    break;
                }
                try {
                    Thread.sleep(10 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName()+"这是第"+tickets--+"" +
                        "号票");
            }
    }
  }
}