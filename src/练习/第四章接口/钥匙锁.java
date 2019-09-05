package 练习.第四章接口;

public class 钥匙锁 implements Lock{
    @Override
    public void open(){
        System.out.println("往左转动了就好！！！");
    }
    @Override
    public  void close(){
        System.out.println("往右转动我就锁上了！！！");
    }

}
