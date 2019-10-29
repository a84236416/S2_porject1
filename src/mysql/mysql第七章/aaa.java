package mysql.mysql第七章;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import  org.apache.log4j.Logger;

/**
 * Created by Admin on 2019/10/23.
 */
public class aaa {
private static Logger logger= Logger.getLogger(aaa.class.getName());
    public static void main(String[] args) {
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Drive r");
        } catch (ClassNotFoundException e) {
            logger.error(e);
        }
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sss","root","123456");
            System.out.println("连接成功！！！");
        } catch (SQLException e) {
            logger.error(e);
        }finally {
            try{
                if(null!=conn){
                    conn.close();
                    System.out.println("关闭连接成功");
            }
            }catch(SQLException e){
                logger.error(e);
            }
        }

    }
}
