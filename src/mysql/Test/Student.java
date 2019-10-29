package mysql.Test;

import java.util.Date;

/**
 * Created by Admin on 2019/10/26.
 */
public class Student {
    private Integer studID;
    private  String stuName;
    private String stuSex;
    private Date stuBirthday;
    private Integer gradeID;

    public Integer getStudID() {
        return studID;
    }

    public void setStudID(Integer studID) {
        this.studID = studID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Date getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(Date stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }
}
