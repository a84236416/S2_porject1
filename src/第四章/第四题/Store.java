package 第四章.第四题;

public class Store {
    public static  Animal get(String choic){
        if (choic.equalsIgnoreCase("dog")){
            return  new Dog();
        }else if (choic.equalsIgnoreCase("pig")){
            return new pig();
        }else {
            return new Cat();
        }
    }
}
