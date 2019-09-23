package 第四章.第五题;

public class Dog extends pet implements Eatable,FlyingDiscCatchable {
    public Dog(String name,int health,int love){
        this.name=name;
        this.health=health;
        this.love=love;
    }

    @Override
    public  void catchingFlyDisc(){
        System.out.println(this.name+"玩一个游戏 接飞盘！！！！");
    }
    @Override
    public void eat(){
        System.out.println(this.name+"喜欢吃骨头");
    }
    @Override
    public  void print(){
        System.out.println("我是一只："+this.name+",我的健康值是："+this.health+",和主人的亲密度是："+this.love+"。");
        eat();
        catchingFlyDisc();
    }
}
