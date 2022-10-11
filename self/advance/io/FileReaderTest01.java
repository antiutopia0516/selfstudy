package advance.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
 * FileReader:
 *  文件字符输入流，只能读取普通文本
 *  读取普通文本时，比较方便快捷
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            // 创建字符串输入流
            reader = new FileReader("myfile");

            // 准备一个char数组
            char[] chars = new char[4];
            // 往chars数组中读
            reader.read(chars);// 按照字符的方式读取
            for (char c : chars) {
                System.out.println(c);
            }
            // 开始读
            /* char[] chars = new char[4];// 一次读取四个字符
            int readCount = 0;
            while((readCount = reader.read(chars)) != -1){
                System.out.println(new String(chars, 0, readCount));
            } */
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
