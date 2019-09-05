package 第二张第五题;

public abstract class Animal {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;
    public Animal(int age){
        this.age=age;
    }
    public abstract void info();
}