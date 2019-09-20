package 第五章.第三题;
import org.apache.log4j.Logger;
public class abnormal {
    private static final Logger logger = Logger.getLogger(abnormal.class);
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
            System.out.println(array[9]);
        }catch (Exception e){
            logger.error("数组越界了！！！");
        }finally {
            System.out.println("程序结束！！！");
        }
    }
}
