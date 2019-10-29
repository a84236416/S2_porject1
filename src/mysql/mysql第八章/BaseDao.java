package mysql.mysql第八章;

import java.sql.*;

/**
 * Created by Admin on 2019/10/24.
 */
public class BaseDao {
    private Connection conn = null;

    public Connection getConnction() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschool",
                    "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void close(Connection conn, Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int executeUpdate(String sql, Object[] objects) {
        int i = 0;
        Connection conn = getConnction();
        PreparedStatement stam = null;
        try {
            stam = conn.prepareStatement(sql);
            for (int x = 0; x < objects.length; x++) {
                stam.setObject(x + 1, objects[x]);
            }
            i = stam.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, stam);
        }
        return i;
    }

    public ResultSet executeQuery(String sql, Object[] objects) throws Exception {
        ResultSet rs = null;
        Connection conn = getConnction();
        PreparedStatement stam = null;
        stam = conn.prepareStatement(sql);
        for (int x = 0; x < objects.length; x++) {
            stam.setObject((x + 1), objects[x]);
        }
        rs=  stam.executeQuery();
        return  rs;
    }
}
