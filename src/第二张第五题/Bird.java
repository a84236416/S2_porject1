package 第二张第五题;

public class Bird extends Animal {
    public String color;
    public Bird(String color,int age){
        super(age);
        this.color=color;
        info();
    }
    @Override
    public void info(){
        System.out.println("我是一只"+this.color+"的鸟！");
        System.out.println("我今年"+this.age+"岁了！");
    }
}
