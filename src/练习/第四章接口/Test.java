package 练习.第四章接口;

public class Test {
    public static void main(String[] args) {
        木门 door=new 木门();
        door.lock=new 钥匙锁();
        door.Doorclose();
        door.Dooropen();
        System.out.println("------------------------");
        木门 door1=new 木门();
        door1.lock=new 电子锁();
        door1.Dooropen();
        door1.Doorclose();
    }
}
