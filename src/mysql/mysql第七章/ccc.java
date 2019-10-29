package mysql.mysql第七章;

import mysql.Test.DBHelper;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 2019/10/25.
 */
public class ccc {
    public static void main(String[] args) {
        Connection conn= DBHelper.getConnection();
        Statement st=null;
        int rowCount= 0;
        String sql="INSERT INTO SUBJECT(`subjectName`,`classHour`,`gradeID`)\n" +
                "VALUES('Java AA',122,44)";
        try {
            st=conn.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            rowCount = st.executeUpdate(sql);
            if (rowCount==1){
                System.out.println("添加成功！！！");
            }
            System.out.println(rowCount);

        } catch (SQLException e) {
            e.printStackTrace();
        }
            DBHelper.closeConn(null,conn,st);
    }
}
