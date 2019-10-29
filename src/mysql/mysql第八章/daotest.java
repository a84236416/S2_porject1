package mysql.mysql第八章;

import jdk.internal.instrumentation.TypeMapping;
import org.junit.Test;

import java.util.List;

/**
 * Created by Admin on 2019/10/24.
 */
public class daotest {
    @Test
    public void add1(){
       // MySchoolDaolmpl  一换就实现了不用的数据库之间的切换
        MySchoolDao dao=new MySchoolDaolmpl();

        Myschool item= new Myschool();
        item.setSubjectName("c#####");
        item.setClassHour(22);
        item.setGradeID(22);
        int i=dao.add(item);
        if (i>0){
            System.out.println("OK");
        }else {
            System.out.println("unOK");
        }
    }
    @Test
    public void update(){
        MySchoolDao dao=new MySchoolDaolmpl();
        Myschool itme=new Myschool();
        itme.setSubjectName("zxcas");
        itme.setClassHour(22);
        itme.setGradeID(1);
        itme.setSubjectNo(2);
        int i=dao.update(itme);
        if (i>0){
            System.out.println("OK");
        }else {
            System.out.println("再见！！！");
        }
    }
    @Test
    public void sel()throws Exception{
        MySchoolDao dao=new MySchoolDaolmpl();
        Myschool i=dao.findSchoolByid(6);
        System.out.println(i);
    }

    @Test
    public void se333(){
        MySchoolDao dao=new MySchoolDaolmpl();
        List<Myschool> i=dao.findAll();
        System.out.println(i);
    }
    @Test
    public void aaa(){
      MySchoolDao dao=new MySchoolDaolmpl();
       List<Myschool> i=dao.findAll();
       for ( Myschool myschool :i){
           System.out.println(myschool.getSubjectNo()+"\t"+myschool.getSubjectName()+"\t"+myschool.getClassHour()+"\t"+myschool.getGradeID());

       }
    }
}
