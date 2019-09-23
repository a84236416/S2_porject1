package 练习.练习1;

public interface Sortable {
    public void sort(int[] nums);

}
//冒泡排序
class  BubbleSort implements Sortable{
    @Override
    public  void sort(int [] nums){
        System.out.println("==============冒泡排序===========");
    }
}
//二分排序
class DivisionSort implements  Sortable{
    @Override
    public  void sort(int [] nums){
        System.out.println("============二分排序==================");
    }
}
//插入排序
class  InsertSort implements  Sortable{
    @Override
    public void sort(int [] nums){
        System.out.println("=============插入排序=============");
    }
}

class  Context1{
    public void doSort(Sortable sortable,int [] nums){
        sortable.sort(nums);
    }
}
class  Context{
   private Sortable sortable;
    public Context(Sortable sortable){
        this.sortable=sortable;
    }
    public void doSort(int [] nums){
        sortable.sort(nums);
    }
}
class  Test{
    public static void main(String[] args) {
      Sortable sortable=new BubbleSort();
      Context ctx=new Context(sortable);
      ctx.doSort(new int[]{1,2,3,4,5});
    }
}
class  Test1{
    public static void main(String[] args) {
        Sortable sortable=new InsertSort();
        Context1 context1=new Context1();
        context1.doSort(sortable,new int[]{1,2,3,5,5});
    }
}