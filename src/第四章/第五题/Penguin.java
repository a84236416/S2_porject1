package 第四章.第五题;

public class Penguin extends pet implements Eatable,Swinmmable {

    public  Penguin(String name,int health,int love){
        this.name=name;
        this.health=health;
        this.love=love;
    }
    @Override
    public void swim(){
        System.out.println(this.name+"会游泳！！！");
    }
    @Override
    public void eat(){
        System.out.println(this.name+"喜欢吃鱼！！！");
    }
    @Override
    public void print(){
        System.out.println("我是一只："+this.name+",我的健康值是："+this.health+",和主人的亲密度是："+this.love+"。");
        swim();
        eat();
    }
}
