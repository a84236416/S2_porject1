package 练习.练习1;

interface photograph{
    public void takePhoto();
}
class  Nokia implements photograph{
    @Override
    public void takePhoto(){
        System.out.println("我本来是一个王者现在不行了，但是还是来一张！！！");
    }

}
class  iPhone8pulse implements  photograph{
    @Override
    public  void takePhoto(){
        System.out.println("安卓机都是弟弟，让我来拍一张！！！");
    }
}
public class demo1 {

    public  void photograph(photograph ph){
        ph.takePhoto();
    }

    public static void main(String[] args) {
        demo1 dm=new demo1();
       dm.photograph(new iPhone8pulse());
       dm.photograph(new Nokia());
    }
}
