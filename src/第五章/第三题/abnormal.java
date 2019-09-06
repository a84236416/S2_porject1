package 第五章.第三题;

public class abnormal {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
            System.out.println(array[9]);
        }catch (Exception e){
            System.out.println("数组越界了可能！！！");
            e.printStackTrace();
        }finally {
            System.out.println("程序结束！！！");
        }
    }
}
