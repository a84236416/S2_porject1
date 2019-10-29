package mysql.Test;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Admin on 2019/10/26.
 */
public class GradeDAOImpl extends BaseDAO implements GradeDAO {

    @Override
    public Integer add(Grade grade) {
      String sql="insert into gerade values (null,?)";
        return  this.executeUpdate(sql, grade.getGradeName());

    }

    @Override
    public Integer edlete(Integer gradeID) {
     String sql="delete from Geade where gradeID=?";
     return this.executeUpdate(sql,gradeID);
    }

    @Override
    public List<Grade> findAll() {
           Connection conn=this.getConnection();
          PreparedStatement ps=null;
        ResultSet rs=null;
        List<Grade> list=new ArrayList<Grade>();
        String sql="select * from Grade";
        try {
            ps= conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Grade grade=new Grade();
                grade.setGradeID(rs.getInt("grade"));
                grade.setGradeName(rs.getString("gradeName"));
                list.add(grade);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
  return list;
    }
}
