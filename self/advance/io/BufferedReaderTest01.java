package advance.io;

import java.io.BufferedReader;
import java.io.FileReader;

/* 
 * BufferedReader:
 *  带有缓冲区的字符输入流
 *  使用这些流的时候，不需要自定义char数组或者byte数组。自带缓冲
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{
        // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做节点流
        // 外部负责包装的这个流叫做包装流，还有一个名字叫做处理流
        // 想当前这个程序来说，FileReader就是一个节点流,而BufferedReader就是一个处理流
        FileReader reader = new FileReader("myfile");
        BufferedReader br = new BufferedReader(reader);

        /* String firstLine = br.readLine();
        System.out.println(firstLine); */

        String s = null;
        while((s = br.readLine()) != null){
            System.out.println(s);
        }

        // 关闭流
        // 对于包装流来说，只需要关闭最外层就行，里面的节点会自动关闭
        br.close();
    }
}
