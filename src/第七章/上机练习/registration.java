package 第七章.上机练习;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.Map;

class SicknessDeom{
    public static void main(String[] args) {
        //创建特需号线程
        registration special=new registration("特需号",10,3000);
        //修改主线程名字
        Thread.currentThread().setName("普通号");
        //设置特需号线程优先级高，提高特需号叫到几率
        //special.setPriority(5);
        //启动子线程，也叫特需号线程
        special.start();
        for (int i=1;i<=50;i++){
            System.out.println(Thread.currentThread().getName()+":"+i+"号病人在看病");
            //普通号叫到第10个号，特需号线强行执行，阻止主线程
            if(i==10){
                try {
                    //子线程（特需号主线）强行执行
                    special.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                //普通号看病间隔时间
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 public class registration extends Thread {
   private String name;//线程名字
    private int number;
    private int time;
    public registration(String name,int number,int time){
        super(name);//调用Thread类的构造方法，在创建线程对象时指定线程名
        this.number=number;
        this.time=time;
    }
    @Override
    public void run(){
        for (int i=1;i<number;i++){
            System.out.println(this.getName()+":"+i+"号病人在看病");
        }
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

