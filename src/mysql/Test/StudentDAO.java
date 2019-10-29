package mysql.Test;

import java.util.List;

/**
 * Created by Admin on 2019/10/26.
 */
public interface StudentDAO {
   public Integer add(Student stu);
   public Integer delete (Integer stuID);
   public Integer countStudent();
   public List<Student>findAll();
   public Student getByID(Integer stuID);
}
