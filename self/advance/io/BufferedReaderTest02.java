package advance.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        /* // 字节流
        FileInputStream in = new FileInputStream("myfile");

        // 通过转换流转换
        InputStreamReader reader = new InputStreamReader(in);
        
        // 这个方法只能传字符流，不能传字节流，怎么办
        BufferedReader br = new BufferedReader(reader); */

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("myfile")));

        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
    }
}
