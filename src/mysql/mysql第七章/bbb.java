package mysql.mysql第七章;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Admin on 2019/10/25.
 */
public class bbb {
private static Logger logger=Logger.getLogger(bbb.class.getName());

    public static void main(String[] args) {
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            logger.error(e);
        }
        try {
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sss","root","123456");
            System.out.println("连接成功！！！");
        } catch (SQLException e) {
            logger.error(e);
        }finally {
            if (conn!=null){
                try {
                    conn.close();
                    System.out.println("关闭成功！！！");
                } catch (SQLException e) {
                    logger.error(e);
                }
            }
        }
    }
}