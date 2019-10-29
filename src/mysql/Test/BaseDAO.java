package mysql.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by Admin on 2019/10/27.
 */
//它是所有DAO实现的父类，通用操作写在这里类的里面
public class BaseDAO {
//配置好连接数据库的相关信息
    private static  String USER;
    private static  String PWD;
    private static  String DEIVER;
    private static  String URL;

    static {
        try {
            //读取db.properties配置文件中的配置内容
            initProperties();
            //加载驱动
            Class.forName(DEIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

 public  static void initProperties(){
     String cfgDile="db.properties";
     InputStream is= BaseDAO.class.getClassLoader().getResourceAsStream(cfgDile);
     Properties props= new Properties();
     try {
         props.load(is);
         USER =props.getProperty("USER ");
         PWD =props.getProperty("PWD ");
         DEIVER =props.getProperty("DEIVER ");
         URL =props.getProperty("URL ");
     } catch (IOException e) {
         e.printStackTrace();
     }

 }
    public  Connection getConnection() {
         Connection conn=null;
        try {
            conn= DriverManager.getConnection(URL,USER,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public  void closeConn(ResultSet rs, Connection conn, Statement st){
        if (rs!=null){
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (st!=null){
            try{
                st.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public  Integer executeUpdate(String sql,Object... params){
        Connection conn=this.getConnection();
        PreparedStatement ps=null;
        int rowCunt=0;
        try{
            ps=conn.prepareStatement(sql);
          if (params!=null){
              for (int i=0;i<params.length;i++){
                  ps.setObject(i+1,params[i]);
              }
          }
            rowCunt  =ps.executeUpdate();

        }catch (Exception e){

        }finally {
            this.closeConn(null,conn,ps);
        }

        return rowCunt;
    }
    public ResultSet executeQuery(String sql, Object...objects){
        Connection conn = this.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int x = 0; x < objects.length; x++) {
                ps.setObject((x + 1), objects[x]);
            }
            rs=  ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.closeConn(rs,conn,ps);
        }

        return  rs;
    }

}
