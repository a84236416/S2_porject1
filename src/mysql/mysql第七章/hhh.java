package mysql.mysql第七章;

import mysql.Test.DBHelper;

import java.sql.*;

/**
 * Created by Admin on 2019/10/25.
 */
public class hhh {
    public static void main(String[] args)throws SQLException {
        Connection conn= DBHelper.getConnection();
        String sql="select * from userinfo where userName=? and userowd=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,"zhangsan");
        ps.setString(2,"1' or '1'='1");
        ResultSet rs=ps.executeQuery();
        if (rs.next()){
            System.out.println("登入成功！！！");
        }else {
            System.out.println("登入失败！！！");
        }
        DBHelper.closeConn(rs,conn,ps);
    }
}
