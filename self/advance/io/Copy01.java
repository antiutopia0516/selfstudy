package advance.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
 * 使用FileInputStream + FileOutPutStream完成文件的拷贝
 * 拷贝的过程是一边读一边写
 * 使用以上的字节流拷贝的时候，文件类型随意，万能的。什么样的文件都能拷贝
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 创建一个输入流对象
            fis = new FileInputStream("/Users/shuhong/Desktop/self/advance/io/temp.txt");

            // 创建一个输出流对象
            fos = new FileOutputStream("myfile");

            // 最核心的，一边读，一边写
            byte[] bytes = new byte[1024 * 1024];

            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1){
                fos.write(bytes, 0, readCount);
            }

            //刷新，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            if(fis != null){
                // 分开try，不要一起try
                // 一起try的时候，其中一个出现异常，可能会影响另一个的关闭
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
