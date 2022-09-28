package advance.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;
/* 
 * ArrayList集合：
 *  1、默认初始化容量10（底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量10）
 *  2、集合底层是一个Object[]数组
 *  3、构造方法：
 *      new ArrayList();
 *      new ArrayList(20);
 *  4、ArrayList集合的扩容：
 *      原容量的1.5倍
 *      ArrayList集合底层数组，怎么优化？
 *          尽可能少的扩容，因为数组扩容效率比较低，建议在使用ArrayList集合的时候偶预估计元素的个数，给定一个初始化容量
 *  5、数组的优点：检索效率比较高（每个元素占用空间大小相同，内存地址是连续的，知道首元素内存地址，然后知道下标，通过数学表达式计算出元素的
 *              内存地址，所以检索效率最高）
 *  6、数组的缺点：随机增删元素效率比较低
 *  7、向数组末尾添加元素，效率还是比较高的
; */
public class ArrayListTest01 {
    public static void main(String[] args) {
        List list1 = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        System.out.println(list1.size());

        list1.add(11);


    }
}
