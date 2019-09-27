package 练习.练习1;


class Test11{
    public static void main(String[] args) {
//        Runnable aaa=new AAA();
//        Thread thread=new Thread(aaa);
//        thread.start();
//        for (int i=0;i<900;i++){
//
//            System.out.println("bbbbbbbbbbbbbb");
//        }
        Thread.currentThread().setName("重案组之虎曹达华");
        System.out.println(Thread.currentThread().getName());
        new Thread("重案组之虎曹达华"){
            @Override
            public void run(){
                for (int i=0;i<100;i++){
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.getName()+"........aaaaaaaa");
                }
            }
        }.start();

        Thread t2=new Thread("软饭硬吃曹达华"){
            @Override
            public void run(){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i=0;i<100;i++){
                    System.out.println(this.getName()+".......bbbbbbbbbb");
                }
            }
        };
        t2.start();
    }
}
public class AAA implements Runnable {
    @Override
    public void run(){
        for (int i=0;i<900;i++){
            System.out.println("aaaaaaaaaaa");
        }
    }
}
