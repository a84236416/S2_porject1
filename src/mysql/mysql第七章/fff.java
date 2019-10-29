package mysql.mysql第七章;

import mysql.Test.DBHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 2019/10/25.
 */
public class fff {
    public static void main(String[] args) {
        Connection conn= DBHelper.getConnection();
        Statement st=null;
        ResultSet rs=null;
        String sql="SELECT * from subject";
        try {
             st=conn.createStatement();
             rs=st.executeQuery(sql);
             while (rs.next()){

             String subjectName=rs.getString("subjectName");
             int classHour=rs.getInt("classHour");
             int gradeID=rs.getInt("gradeID");
                 System.out.println(subjectName+"\t"+classHour+"\t"+gradeID);
             }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeConn(rs,conn,st );
        }
    }
}
