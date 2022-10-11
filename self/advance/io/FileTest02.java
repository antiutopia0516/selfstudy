package advance.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("/Users/shuhong/Desktop/self/advance/io/temp.txt");
        String fileName = f1.getName();
        System.out.println(fileName);

        // 判断是否是一个目录
        System.out.println(f1.isDirectory());

        // 判断是否是一个文件
        System.out.println(f1.isFile());

        // 获取文件最后一次修改时间
        long haoMiao = f1.lastModified();
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        // 获取文件大小
        System.out.println(f1.length());
    }
}
