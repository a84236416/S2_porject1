package mysql.mysql第七章;

import mysql.Test.DBHelper;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 2019/10/23.
 */
public class Test
{
    private  static Logger logger=Logger.getLogger(Test.class.getName());
    public static void main(String[] args) {
        Statement st=null;
        Connection conn= DBHelper.getConnection();
String sql="insert into teacher values(null,'张三',22,'2019-09-09')";
        try {
             st=conn.createStatement();
        } catch (SQLException e) {
            logger.error(e);
        }
        try {
            int i= st.executeUpdate(sql);
            if (i==1){
                System.out.println("执行成功！！！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DBHelper.closeConn(null,conn,st);
    }
}
