package advance.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* 
 * 处理异常的第一种方法：在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁。抛给调用者来处理
 * 
 * 第二种方法：try catch捕捉异常
 */
public class ExceptionTest05 {
    public static void main(String[] args){
        System.out.println("main begin");

        try {
            //try尝试
            m1();
            System.out.println("HelloWorld");
        }catch(FileNotFoundException e){
            // catch是捕捉异常之后走的分支
            System.out.println("文件不存在");
        }
        
        System.out.println("main end");
    }

    private static void m1() throws FileNotFoundException{
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() throws FileNotFoundException{
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException {
        //调用SUN jdk中某个类的构造方法
        // 创建一个输入流对象，需要一个文件
        new FileInputStream("/Users/shuhong/Desktop/self/adva-nce/note.txt");
    }
}
