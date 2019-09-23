package 练习.第四章接口;

public class 木门 extends Door {
    public  Lock lock;
    @Override
    public  void  Dooropen(){
        lock.open();
    }
    @Override
    public void Doorclose(){
        lock.close();
    }
}
