package 练习;

public class a1 {
    public static void main(String[] args) {
       Teach teach=new ChineseTeacher();
       Teach teach1=new yingyuTeacher();
       teach1.Work();
        teach.Work();
}
}

abstract class Teach{
    public abstract void  StartClass();
    public  abstract void teaching();
    public  abstract void sumarise();
    public  abstract void endClass();
    public  final void  Work(){
        StartClass();
        teaching();
        sumarise();
        endClass();
    }
}
class ChineseTeacher extends Teach{
    @Override
    public void  StartClass(){
        System.out.println("1");
    }
    @Override
    public void  teaching(){
        System.out.println("2");
    }
    @Override
    public void  sumarise(){
        System.out.println("3");
    }
    @Override
    public void  endClass(){
        System.out.println("4");
    }
}
class  yingyuTeacher extends Teach{
    @Override
    public void  StartClass(){
        System.out.println("是");
    }
    @Override
    public void  teaching(){
        System.out.println("不是");
    }
    @Override
    public void  sumarise(){
        System.out.println("可能是");
    }
    @Override
    public void  endClass(){
        System.out.println("应该不是");
    }
}