package 第三章.第六题;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        System.out.println("今天分别来了俩位不同国家的朋友（1是招待中国的王小强，2.招待美国的约翰）");
        Scanner input=new Scanner(System.in);
        int zd=input.nextInt();
        John john=new John();
        mankind m=john.Choice(zd);
        m.show();
    }
}
