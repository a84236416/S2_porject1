package 练习.练习1;



public class lookdisease  implements Runnable{
    public void run(){
        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i+"号病人在看病！");
        }
    }
}
class Test14{
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new lookdisease());
        thread.setName("特需号");
       thread.start();
        for (int i=1;i<=50;i++){
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
            }
            if (i==10){
                try {
                    Thread.sleep(1000);
                    thread.join();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+":"+i+"号病人在看病！");
        }

    }
}
