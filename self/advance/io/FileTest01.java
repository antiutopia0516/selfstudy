package advance.io;

import java.io.File;

/* 
 * File
 *  1、File和四大家族没有关系，所以File类不能完成文件的读和写
 *  2、File对象代表什么？
 *      文件和目录路径名的抽象表现形式。
 *      C:\Driver 是一个File对象
 *      C:\Driver\Lan\Readme.txt 也是一个File对象
 *      一个File对象有可能是目录，也可能是文件。
 *      File只是一个路径名的抽象表示形式
 *  3、需要掌握File类的常用方法
 */
public class FileTest01 {
    public static void main(String[] args) throws Exception{
        File f1 = new File("/Users/shuhong/Desktop/self/advance/io/temp.txt");

        // 判断是否存在
        System.out.println(f1.exists());

        // 如果不存在，则以文件的形式创建
        /* if(!f1.exists()){
            f1.createNewFile();
        } */

        /* // 如果不存在，则以目录的方式创建
        if(!f1.exists()){
            // 以目录的形式创建
            f1.mkdir();
        } */

        // 可以创建多重目录吗
        File f2 = new File("a/b/c/d/e/f");
        if(!f2.exists()){
            f2.mkdirs();
        }

        File f3 = new File("/Users/shuhong/Desktop/self/advance/io/temp.txt");
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println(parentFile.getAbsolutePath());
    }
}
