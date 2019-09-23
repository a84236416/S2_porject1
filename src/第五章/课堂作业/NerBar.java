package 第五章.课堂作业;

public class NerBar {
    public void enter(int  age){
        if (age<18) {
            throw  new  AgeLessThan18Exception("你神经病啊！！！");
        }
    }
    public static void main(String[] args) {
        NerBar nerBar=new NerBar();
        try {
            nerBar.enter(17);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
