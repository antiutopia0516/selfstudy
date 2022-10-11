package advance.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

/* 
 * java.io.PrintStream:标准的字节输出流。默认输出到控制台
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception{
        System.out.println("hello world");

        PrintStream ps = System.out;
        ps.println("hello zhangsan");

        // 标准输出流不需要关闭
        // 可以改变标准输出流的输出方向吗？可以
        // System.currentTimeMillis();

        // 标准输出流不再指向控制台，指向log文件
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        // 修改输出方向，将输出方向修改到log文件
        System.setOut(new PrintStream(printStream));
        System.out.println("hello world");
        System.out.println("hello kitty");
        System.out.println("hello zhangsan");

    }
}
