package 第二章第六题;

public class poultry {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String love;
    public  String behavior;
    public String  variety;
    public poultry(String name,String love,String behavior,String variety){
        this.name=name;
        this.love=love;
        this.variety=variety;
        this.behavior=behavior;
        motion();
    }
    public void  motion(){
        System.out.println("我叫"+this.name+",是一只"+this.behavior+"!");
        System.out.println("我喜欢"+this.love+"!");
        System.out.println("我会"+this.variety+"!");
    }
}
