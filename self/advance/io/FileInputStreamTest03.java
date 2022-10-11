package advance.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * int read(byte[] b)
 *  一次最多读取b.length个字节
 *  减少硬盘和内存的交互，提高程序的执行效率
 *  往byte[]数组中读
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("/Users/shuhong/Desktop/self/advance/io/temp.txt");

            // 开始读，采用byte数组，一次读取多个字节。最多读取"数组.length"个字节
            byte bytes[] = new byte[4];
            // 这个方法的返回值是：读取到的字节数量
            int readCount = fis.read(bytes);// 第一次读到了4个字节
            System.out.println(readCount);// 4
            // 将字节数组全部转换成字符串
            // System.out.println(new String(bytes));// abcd
            // 不应该全部都转换，应该是读取了多少个字节，转换多少个字节
            System.out.println(new String(bytes, 0, readCount));

            readCount = fis.read(bytes);// 第二次只读到了三个字节
            System.out.println(readCount);// 3
            System.out.println(new String(bytes, 0, readCount));

            // System.out.println(new String(bytes));// efgd

            readCount = fis.read(bytes);// 一个字节都没有读到
            System.out.println(readCount);// -1

            // System.out.println(new String(bytes));// efgd
            

        }catch(FileNotFoundException e){
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
