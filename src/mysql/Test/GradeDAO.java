package mysql.Test;

import java.util.List;

/**
 * Created by Admin on 2019/10/26.
 */
public interface GradeDAO {
    public Integer add(Grade grade);
    public Integer edlete(Integer gradeID);
    public List<Grade> findAll();
}
