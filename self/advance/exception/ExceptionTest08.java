package advance.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * 关于try..catch中的finally子句
 *  1、在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常
 *      fianlly子句必须和try一起出现，不能单独编写
 * 
 *  2、fianlly语句通常使用在哪些情况下呢
 *      通常在finally语句块中完成资源的释放/关闭
 *      因为fianlly中的代码比较有保障
 *      即使try语句块中的代码出现异常，fianlly中代码也会正常执行
 */
public class ExceptionTest08 {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            // 创建输入流对象
            new FileInputStream("file");

            String s = null;

            // 一定会出现空指针异常
            s.toString();

            // 流使用完需要关闭，因为流是占用资源的
            // 即使以上程序出现异常，流也需要关闭
            // 放在这里就有可能流关不了
            //fis.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        } finally {
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
