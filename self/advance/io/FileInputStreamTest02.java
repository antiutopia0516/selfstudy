package advance.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * 对第一个程序进行改进
 * 
 * 分析这个程序的缺点：
 *  一次读取一个字节byte，这样内存和硬盘交互太频繁，基本上时间/资源都耗费在交互上面了。
 *  能不能一次读取多个字节呢？可以
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/shuhong/Desktop/self/advance/io/temp.txt");
            /* while(true){
                int readData = fis.read();
                if(readData == -1){
                    break;
                }
                System.out.println(readData);
 */
                // 改造while循环
                int readData = 0;
                while((readData = fis.read()) != -1){
                    System.out.println(readData);
                }
            } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
