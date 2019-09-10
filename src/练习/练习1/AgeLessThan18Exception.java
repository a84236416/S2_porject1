package 练习.练习1;

public class AgeLessThan18Exception extends RuntimeException{
    public AgeLessThan18Exception(String message){
        super(message);
    }
}
class NerBar{
    public void enter(int age){
        if (age<18){
            throw  new  AgeLessThan18Exception("你神经病啊！！！");
        }
    }

    public static void main(String[] args) {
         NerBar nerBar=new NerBar();
         try{
             nerBar.enter(16);
        }catch (Exception e){
          e.printStackTrace();
         }

    }
}