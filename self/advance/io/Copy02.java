package advance.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 
 * 使用FileReader和FileWriter进行拷贝的话，只能拷贝普通文本文件
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            // 读
            in = new FileReader("myfile");
            // 写
            out = new FileWriter("/Users/shuhong/Desktop/self/advance/io/temp.txt");

            // 一边读一边写
            char[] chars = new char[1024 * 512];
            int readCount = 0;
            while((readCount = in.read(chars)) != -1){
                out.write(chars, 0, readCount);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
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
