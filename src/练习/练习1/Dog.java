package 练习.练习1;

import java.util.ArrayList;
import java.util.List;
public class Dog {
    String name;
    String variety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Dog(String name, String variety){
       this.name=name;
       this.variety=variety;
    }

    @Override
    public String toString() {
        return name+" "+variety;
    }
}
class Test2{
    public static void main(String[] args) {
        Dog ououDog=new Dog("欧欧","雪纳瑞");
        Dog yayaDog=new Dog("亚亚","拉布拉多");
        Dog meimeiDog=new Dog("美美","雪纳瑞");
        Dog feifeiDog=new Dog("菲菲","拉布拉多");
        List dogs=new ArrayList();
        dogs.add(ououDog);
        dogs.add(yayaDog);
        dogs.add(meimeiDog);
        dogs.add(0,feifeiDog);//添加到指定位置
        System.out.println(dogs.size()+"条狗");
        System.out.println("分别是：");
        for (int i=0; i<dogs.size();i++){
            Dog dog=(Dog)dogs.get(i);
            System.out.println(dog.getName()+"\t"+dog.getVariety());
        }
    }
}
