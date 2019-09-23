package 练习.练习1.第六章;

public class Student {
    private   int stuID;
    private  String name;
    public  Student(int stuID,String name ){
        super();
        this.name=name;
        this.stuID=stuID;
    }
    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
