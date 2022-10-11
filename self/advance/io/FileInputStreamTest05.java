package advance.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * FileInputStream类的其他用法
 *  int available() 返回流当中剩余的没有读到的字节数量
 *  long skip(long n) 跳过几个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/shuhong/Desktop/self/advance/io/temp.txt");
            System.out.println("总字节数量" + fis.available());

            //byte[] bytes = new byte[fis.available()];

            //int readCount = fis.read(bytes);

            //System.out.println(new String(bytes));

            // skip方法
            fis.skip(3);
            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
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
