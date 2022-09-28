package advance.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

/* 
 * 深入Collection集合的contains方法
 *  boolean	contains(Object o)
 *      判断集合中是否包含某个对象
 *      如果包含返回true，不包含返回false
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();

        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);

        // 集合中元素的个数
        System.out.println(c.size());//2

        // 新建的对象String
        String x = new String("abc");
        // c集合中是否包含x
        System.out.println(c.contains(x));
    }
} 
