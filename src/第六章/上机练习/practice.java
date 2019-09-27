package 第六章.上机练习;

import java.util.ArrayList;
import java.util.List;

public class practice<T>{
private int  pageSum;//总页数
private int pageAt;//当前页数
private int allRecirdCiunt;//总记录数
private int showRecordCount;//单页显示的记录数

    List<T>list=new ArrayList<T>();//商品列表
    /**
     * 调节总页数 初始载入时、用户调整单页的数量时发生
     */
    private void adjustmentPage(){
        int page=allRecirdCiunt/showRecordCount;
        if (allRecirdCiunt%showRecordCount>0){
            page++;
        }
        this.pageSum=page;
    }

    public int getPageSum() {
        return pageSum;
    }

    public void setPageSum(int pageSum) {
        this.pageSum = pageSum;
    }

    public int getPageAt() {
        return pageAt;
    }

    public void setPageAt(int pageAt) {
        this.pageAt = pageAt;
    }

    public int getAllRecirdCiunt() {
        return allRecirdCiunt;
    }

    public void setAllRecirdCiunt(int allRecirdCiunt) {
        this.allRecirdCiunt = allRecirdCiunt;
    }

    public int getShowRecordCount() {
        return showRecordCount;
    }

    public void setShowRecordCount(int showRecordCount) {
        this.showRecordCount = showRecordCount;
    }


}
