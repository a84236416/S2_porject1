package 练习;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {
        FileMethods fm=new FileMethods();
        File file=new File("D:\\GG\\ABC.txt");
        fm.create(file);
        fm.showFileInfo(file);
        //fm.delete(file);
    }
    public void create(File file){
        try {
            file.createNewFile();
            System.out.println("文件已创建！！！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void delete(File file){
        if (file.exists()){
            file.delete();
            System.out.println("文件已删除！！！");
        }
    }
    public  void showFileInfo(File file){
        if (file.exists()){      //判断文件或目录是否存在
            if (file.isFile()){      //如果是文件
                System.out.println("名称："+file.getName());
                System.out.println("相对路径："+file.getParent());
                System.out.println("绝对路径："+file.getAbsolutePath());
                System.out.println("文件大小："+file.length()+"字节");
            }
            if (file.isDirectory()){
                System.out.println("此文件是目录");
            }else {
                System.out.println("文件不存在");
            }
        }
    }
}

