package mysql.Test;

import java.io.Serializable;

/**
 * Created by Admin on 2019/10/26.
 */
public class Grade implements Serializable{
    private static final long seriaLVrsionUIO=1L;
   private Integer gradeID;
   private  String gradeName;

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
