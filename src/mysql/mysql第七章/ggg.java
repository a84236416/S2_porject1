package mysql.mysql第七章;

import mysql.Test.DBHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 2019/10/25.
 */
public class ggg {
    public static void main(String[] args) {
        Connection conn= DBHelper.getConnection();
        Statement st=null;
        ResultSet rs=null;
        String userName="zhangsan";
        String userPwd="1' or '1'='1";
        String sql ="SELECT * FROM `userinfo` WHERE `userName`='"+userName+"' AND `userowd`='"+userPwd+"'";
        System.out.println(sql);
        try {
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            if (rs.next()){
                System.out.println("==========登入成功！！！==========");
            }else {
                System.out.println("=============用户名或密码错误！！！==================");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeConn(rs,conn,st);
        }
    }
}
class ggg1{
    public static void main(String[] args) {
        Connection conn=DBHelper.getConnection();
        String userName="zhangsan";
        String userPwd="123";
        Statement st=null;
        ResultSet rs=null;
        String sql="SELECT * FROM `userinfo` WHERE `userName`='"+userName+"' AND `userowd`='"+userPwd+"'";
        try {
            st=conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            rs=st.executeQuery(sql);
            if (rs.next()){
                System.out.println("登入成功！！！");
            }else {
                System.out.println("登入失败！！！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeConn(rs,conn,st);
        }
    }

}
