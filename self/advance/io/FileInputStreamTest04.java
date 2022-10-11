package advance.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/* 
 * 最终版
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/shuhong/Desktop/self/advance/io/temp.txt");

            // 准备一个byte数组
            byte[] bytes = new byte[4];
            /* while(true){
                int readCount = fis.read(bytes);
                if(readCount == -1){
                    break;
                }
                System.out.println(new String(bytes, 0, readCount));
            } */
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1){
                System.out.print(new String(bytes, 0, readCount));
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
