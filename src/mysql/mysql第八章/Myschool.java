package mysql.mysql第八章;

/**
 * Created by Admin on 2019/10/24.
 */
public class Myschool {
    private Integer subjectNo;
    private String subjectName;
    private Integer classHour;
    private Integer gradeID;

    public Integer getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(Integer subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getClassHour() {
        return classHour;
    }

    public void setClassHour(Integer classHour) {
        this.classHour = classHour;
    }

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    @Override
    public String toString() {
        return "Myschool{" +
                "subjectNo=" + subjectNo +
                ", subjectName='" + subjectName + '\'' +
                ", classHour=" + classHour +
                ", gradeID=" + gradeID +
                '}';
    }
}
