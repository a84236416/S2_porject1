package mysql.mysql第七章;


import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 2019/10/23.
 */
public class Test3
{
    private static Logger logger=Logger.getLogger(Test3.class.getName());

    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        String name="欧欧";
        int health=100;
        int love=0;
        String strain="酷酷的李翰林";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            logger.error(e);
        }
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ccc","root","123456");
            stmt=conn.createStatement();
            StringBuffer sbsql=new StringBuffer(
                    "insert into dog(name,health,love,strain) values('");
                    sbsql.append(name+"',");
                    sbsql.append(health+",");
                    sbsql.append(love+",'");
                    sbsql.append(strain+"')");
            stmt.execute(sbsql.toString());
            logger.info("插入信息成功！");
        } catch (SQLException e) {
            logger.error(e);
        }finally {
            try{
                if (null!=stmt){
                    stmt.close();
                }
                if (null!=conn){
                    conn.close();
                }
            }catch (SQLException e){
                logger.error(e);
            }
        }
    }
}
