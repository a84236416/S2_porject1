package 练习.练习1;
import  org.apache.log4j.Logger;


public class KKKK {
    private static final Logger logger = Logger.getLogger(KKKK.class);


    public static void main(String[] args) {

        try {
            int i = 1/0;
        }catch (Exception ex){
            logger.error(ex.getMessage());
        }

    }
}
