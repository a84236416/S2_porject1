package 练习;

public class user {
  public  static  void foo(int i) {
    try{
           if (i==1){
             throw new Exception();
           }
      System.out.println("1");
    }catch (Exception e){
      e.printStackTrace();
      System.out.println("2");
    }finally {
      System.out.println("3");
    }
    System.out.println("4");
  }

  public static void main(String[] args) {
    foo(1);
  }
}