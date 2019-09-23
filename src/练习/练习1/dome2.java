package 练习.练习1;

public class dome2 {
    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            System.out.println(i);
            try {
                //让线程休息一下
                Thread.sleep(1000);
            }catch (InterruptedException e){
             e.printStackTrace();
            }
        }
    }
}
