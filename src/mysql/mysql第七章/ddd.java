package mysql.mysql第七章;

import mysql.Test.DBHelper;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Admin on 2019/10/25.
 */
public class ddd {
    public static void main(String[] args) {
        Connection conn= DBHelper.getConnection();
        Statement st=null;
        ResultSet rs=null;
        String sql="SELECT * FROM student ";

        try {
             st=conn.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()){
                //rs.getDate==>java.sql.Date  只有年月日
                //rs.getTimestamp==>java.sql.Timestamp 时间搓 年月日时分秒
                //Timestamp==》可以转换为Java.util.Date
                //
               Timestamp ts= rs.getTimestamp("bornDate");
              Date date=new Date(ts.getTime());
                System.out.println(ts);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd HH:ss:SSS");
                String dateSrt=simpleDateFormat.format(date);
                System.out.println(dateSrt);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeConn(rs,conn,st);
        }
    }
}
