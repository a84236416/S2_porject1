package 练习.第四章接口;

public class 电子锁 implements Lock {
    @Override
    public  void  open(){
        System.out.println("配合一下，试一下指纹开门！！！");
    }
    @Override
    public  void  close(){
        System.out.println("直接把门关上就好了！！！");
    }
}
