package advance.io;

import java.io.File;

/* 
 * File中的listFile方法
 */
public class FileTest03 {
    public static void main(String[] args) {
        // File[] listFiles();
        // 获取当前目录下的所有子文件
        File f = new File("/Users/shuhong/Desktop/self/advance/io");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }
    }
}
