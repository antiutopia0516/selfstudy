package advance.io;

import java.io.FileWriter;
import java.io.IOException;

/* 
 * 文件字符输出流
 * 只能输出普通文本
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            // 创建一个文件字符输出流对象
            out = new FileWriter("myfile");
            // 开始写
            char[] chars = {'我','是','中','国','人'};
            out.write(chars);
            out.write(chars, 2, 3);
            out.write("我是一名java软件工程师");
            // 写出一个换行符
            out.write("\n");
            out.write("HelloWorld");
            // 刷新
            out.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
