package mysql.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2019/10/26.
 */
public class StudentDAOImpl extends BaseDAO implements StudentDAO {

    @Override
    public Integer add(Student stu) {
         String sql="insert into student values(null,?,?,?,?,?)";
         return  this.executeUpdate(sql,stu.getStuName(),
                                          stu.getGradeID(),
                                           stu.getStuSex(),
                                          stu.getStuBirthday(),
                                          stu.getStudID());
    }

    @Override
    public Integer delete(Integer stuID) {
         String sql ="delete from student where stuID=?";
         return  this.executeUpdate(sql,stuID);
    }

    @Override
    public Integer countStudent() {
        return null;
    }

    @Override
    public List<Student> findAll() {
        Connection conn=this.getConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<Student> list=new ArrayList<Student>();
        String sql="select * from student order by stuID asc";
        try{
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Student stu=new Student();
                stu.setGradeID(rs.getInt("stuID "));
                stu.setStuName(rs.getString("stuName"));
                stu.setStudID(rs.getInt("stuAge"));
                stu.setStuSex(rs.getString("stuSex"));
                stu.setStuBirthday(rs.getTimestamp("stuBirthday"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            this.closeConn(rs,conn,ps);
        }

        return list;
    }

    @Override
    public Student getByID(Integer stuID) {
        return null;
    }
    public static void main(String[] args) {
      StudentDAO dao=new StudentDAOImpl();
      List<Student> list=dao.findAll();
      for (Student stu :list){
          System.out.println(stu.getStuName());
      }

    }
}

