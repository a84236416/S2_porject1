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
class  Context{
   //private Sortable sortable;
    //public Context(Sortable sortable){
       // this.sortable=sortable;
    //}
    public void doSort(Sortable sortable,int [] nums){
        sortable.sort(nums);
    }
}
class  Test{
    public static void main(String[] args) {
      Sortable sortable=new BubbleSort();
      Context ctx=new Context();
      ctx.doSort(sortable,new int[]{1,2,3,4,5});
    }
}