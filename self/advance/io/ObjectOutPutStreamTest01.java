package advance.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/* 
 * 1、Student对象不支持序列化
 * 
 * 2、参与序列化和反序列化的对象，必须实现Serializable接口
 * 
 * 3、注意：通过源代码发现，Serializable接口只是一个标志接口。
 *      这个接口当中什么代码都没有。
 *      那么它起到什么作用呢？
 *          起到标识的作用，标志的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇
 *          java虚拟机看到这个接口之后，会为该类自动生成一个序列化版本号
 */
public class ObjectOutPutStreamTest01 {
    public static void main(String[] args) throws Exception{
        Student s = new Student(1111, "zhangsan");

        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        // 序列化对象
        oos.writeObject(s);

        // 刷新
        oos.flush();

        //关闭
        oos.close();
    }
}
