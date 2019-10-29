package mysql.mysql第八章;

import java.util.List;

/**
 * Created by Admin on 2019/10/24.
 */
public interface MySchoolDao {
    int add(Myschool model);
    int update(Myschool model);
    Myschool findSchoolByid(Object...subjectNo )throws Exception;
    List<Myschool>findAll();
}
