package mysql.mysql第八章;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2019/10/24.
 */
public class MySchoolDaolmpl extends BaseDao implements MySchoolDao{
    @Override
    public int add(Myschool model){
        int i=0;
        Connection conn=null;
        PreparedStatement stam=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschool","root","123456");
            String sql="insert into `subject`(`subjectName`,`classHour`,`gradeID`)values(?,?,?)";
            stam=conn.prepareStatement(sql);
            stam.setString(1,model.getSubjectName());
            stam.setInt(2,model.getClassHour());
            stam.setInt(3,model.getGradeID());
            i=stam.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stam.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }
    @Override
    public int update(Myschool model){
        int i=0;
        StringBuffer sb=new StringBuffer();
        sb.append("update subject set subjectName=?,");
        sb.append("                   classHour=?,");
        sb.append("                    gradeID=?");
        sb.append("           where    subjectNo=?");

        Object[] objects={
          model.getSubjectName(),
          model.getClassHour(),
          model.getGradeID(),
          model.getGradeID()
        };
        i=super.executeUpdate(sb.toString(),objects);
        return i;
    }
    @Override
    public Myschool findSchoolByid(Object...subjectNo)throws Exception{
        Myschool item=null;

        StringBuffer sb=new StringBuffer();
        sb.append("select * from subject");
        sb.append("         where subjectNo=?");
        //Object[] objects={subjectNo};

        ResultSet rs=super.executeQuery(sb.toString(),subjectNo);

        while (rs.next()){
            item = new Myschool();
            item.setSubjectName(rs.getString("subjectName"));
            item.setSubjectNo(rs.getInt("subjectNo"));
            item.setClassHour(rs.getInt("classHour"));
            item.setGradeID(rs.getInt("gradeID"));
        }
        rs.close();
        close(null,null);
        return item;
    }

    @Override
    public List<Myschool>findAll(){
        Connection conn=this.getConnction();
        String sql="SELECT * FROM `subject` ORDER BY `subjectNo` ASC";
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<Myschool> list=new ArrayList<Myschool>();
        try {
            ps=conn.prepareStatement(sql);
           rs=ps.executeQuery();
           while (rs.next()){
               Myschool myschool=new Myschool();
               myschool.setSubjectNo(rs.getInt("subjectNo"));
               myschool.setSubjectName(rs.getString("subjectName"));
               myschool.setClassHour(rs.getInt("classHour"));
               myschool.setGradeID(rs.getInt("gradeID"));

              list.add(myschool);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.close(conn,ps);
        }
        return  list;
    }
}
