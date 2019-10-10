package 第七章.上机练习;

public class demo extends Thread{
    private static int sum=1000;
   private static  Object object=new Object();

    public demo(){
        super();
    }
    public demo(String name){
        super(name);
    }
    public void run(){
        while (true){
            synchronized (object){
                if (sum==0){
                    break;
                }
                sum--;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName()+"这是第"+sum+"号票");
            }
        }
    }
}
class Test{
    public static void main(String[] args) {
        demo a1=new demo("第一个窗口");
        demo a2=new demo("第二个窗口");
        demo a3=new demo("第三个窗口");
        demo a4=new demo("第四个窗口");
        a1.start();
        a2.start();
        a3.start();
        a4.start();
    }
}