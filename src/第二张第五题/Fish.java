package 第二张第五题;

public class Fish extends Animal {
    public String weight;
    public Fish(String weight,int age){
        super(age);
        this.weight=weight;
        info();
    }
    @Override
    public void info(){
        System.out.println("我是一只"+this.weight+"的鱼！");
         System.out.println("我今年"+this.age+"岁了！");
    }
}
