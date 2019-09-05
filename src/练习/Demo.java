package 练习;

public class Demo {
    private int[] count;

    public Demo() {
        count = new int[10];
    }

    public void setCount(int ct, int n) {
        count[n] = ct;
    }

    public int getCount(int n) {
        return count[n];
    }

    public void showCount(int n) {
        System.out.println("Count is " + count[n]);
    }

    public static void main(String[] args) {
        Demo a=new Demo();
        a.showCount(9);
    }
}
