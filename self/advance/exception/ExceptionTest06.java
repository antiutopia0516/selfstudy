package advance.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * 深入try catch
 *  1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型
 *  2、catch可以写多个，建议catch的时候，精确的一个一个处理。这样有利于程序的调试
 *  3、catch写多个的时候，从上到下必须遵守从小到大。
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        /* try{
        FileInputStream fis = new FileInputStream("/Users/shuhong/Desktop/self/adva-nce/note.txt");
        System.out.println("以上出现异常，这里无法执行");
        } catch(FileNotFoundException e){
            System.out.println("文件不存在");
        } */

        /* try{
            FileInputStream fis = new FileInputStream("/Users/shuhong/Desktop/self/adva-nce/note.txt");
            System.out.println("以上出现异常，这里无法执行");
            } catch(IOException e){ //多态: IOException e = new FileNotFoundException();
                System.out.println("文件不存在");
            } */

        /* try{
            FileInputStream fis = new FileInputStream("/Users/shuhong/Desktop/self/adva-nce/note.txt");
            System.out.println("以上出现异常，这里无法执行");
            } catch(Exception e){ //多态：Exception e = new FileNotFoundException();
                System.out.println("文件不存在");
            } */

        /* try{
            //创建输入流
            FileInputStream fis = new FileInputStream("/Users/shuhong/Desktop/self/adva-nce/note.txt");
            //读文件
            fis.read();
            } catch(FileNotFoundException e){
                System.out.println("文件不存在");
            } catch(IOException e){
                System.out.println("读文件报错");
            } */

        try{
            //创建输入流
            FileInputStream fis = new FileInputStream("/Users/shuhong/Desktop/self/adva-nce/note.txt");
            
            //进行数学运算
            System.out.println(100 / 0);// 这个异常是运行时异常，编写程序时可以处理，也可以不处理
            
            } catch(FileNotFoundException | ArithmeticException e){//JDK8 新特性
                System.out.println("文件不存在");
            }
    }
}
