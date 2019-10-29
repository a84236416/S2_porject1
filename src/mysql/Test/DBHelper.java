package mysql.Test;

import java.sql.*;

import org.apache.log4j.Logger;

/**
 * Created by Admin on 2019/10/23.
 */
public  class DBHelper {
    private  static Logger logger=Logger.getLogger(DBHelper.class.getName());
  private   static Connection conn=null;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        try {
             conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/s1","root","123456");
        } catch (SQLException e) {
            logger.error(e);
        }
        return conn;
    }
    public static void closeConn(ResultSet rs,Connection conn, Statement st){
        if (rs!=null){
            try {
                rs.close();
            } catch (Exception e) {
                logger.error(e);
            }
        }
       if (st!=null){
           try{
               st.close();
           }catch (Exception e){
              logger.error(e);
           }
       }
        if (conn!=null){
            try {
                conn.close();
            } catch (Exception e) {
               logger.error(e);
            }
        }
    }
}
