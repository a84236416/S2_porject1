package mysql.mysql第七章;

import mysql.Test.DBHelper;
import org.apache.log4j.Logger;

import java.sql.*;

/**
 * Created by Admin on 2019/10/26.
 */
public class Test1 {
    private  static Logger logger=Logger.getLogger(Test1.class.getName());

    public static void main(String[] args)throws SQLException {
        Connection conn= DBHelper.getConnection();
        String sql="";
        Statement ts=conn.createStatement();
        ResultSet rs=ts.executeQuery(sql);
        rs.next();
    }
}
