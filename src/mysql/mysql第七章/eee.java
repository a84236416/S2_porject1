package mysql.mysql第七章;

import mysql.Test.DBHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 2019/10/25.
 */
public class eee {
    public static void main(String[] args) {
        Connection conn= DBHelper.getConnection();
        String sql ="select * from subject";
        Statement st= null;
        ResultSet i=null;
        try {
            st = conn.createStatement();
            //执行查询操作，返回ResultSet：结果集
            //初始情况，RS指向第一行，即没有指向任何以后，所以无法读取数，要调用next（）方法
            //使得rs向下移动一行，就可以读取当前指向那一行的数据了
             i= st.executeQuery(sql);
            i.next();
            String subjectName=i.getString("subjectName");
            System.out.println(subjectName);
            i.next();
            String subjectName2=i.getString("subjectName");
            System.out.println(subjectName2);
            i.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBHelper.closeConn(i,conn,st);
        }


    }
}
