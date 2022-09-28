package advance.collections.list.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/* 
 * Vector:
 *  1、底层也是一个数组
 *  2、初始化容量：10
 *  3、怎么扩容的
 *      扩容之后是原容量的2倍
 *  4、ArrayList集合扩容特点：
 *      10 --> 15 --> 22 --> 33
 *      ArrayList扩容是原容量的1.5倍
 *  5、Vector中所有的方法都是线程同步的，都带有synchronized关键字。是线程安全的。效率比较低，使用较少
 *  6、如何将一个线程不安全的ArrayList集合转换成线程安全的呢？
 *      使用集合工具类：
 *          java.util.Collections;
 * 
 *          java.util.Collection 是集合接口
 *          java.util.Collections 是集合工具类
 */
public class VectorTest01 {
    public static void main(String[] args) {
        Vector vector  = new Vector();
        // 默认容量：10，满了之后扩容，容量为20

        List myList = new ArrayList();// 非线程安全

        //变成线程安全
        Collections.synchronizedList(myList);

        myList.add(1);
        myList.add(2);
    }
}
