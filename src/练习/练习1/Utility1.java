package 练习.练习1;

public interface Utility1 {
    public void  ues();
}
class phone implements  Utility1{
    public void ues(){
        System.out.println("using  phone");
    }
}
 class Testss{
    public static void main(String[] args) {
      Utility1   util=new phone();
      util.ues();
    }
}