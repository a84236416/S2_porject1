package 练习.第八章练习;

import java.io.File;
/*
 File:文件
 exist：存在
 Directory：文件夹，目录
 */
public class demo15 {
    public static void main(String[] args) {
        File file=new File("D:/test.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println(file.length());
        //System.out.println(file.mkdirs());
        // System.out.println(file.delete());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());

    }
}
