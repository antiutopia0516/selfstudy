package advance.collections.collection;

import java.util.ArrayList;
import java.util.Collection;


/* 
 * 关于java.util.Collection接口中常用的方法
 *  1、Collection中能存放什么元素
 *      没有使用“泛型”之前，Collection中可以存储Object的所有子类型
 *      使用了“泛型”之后，Collection中只能存储某个具体的类型
 *      
 *  2、Collection中的常用方法
 *      boolean	add(Object e);
 *      int	size();
 *      void	clear();
 *      boolean	contains(Object o) 判断当前集合中是否包含元素o
 *      boolean	remove(Object o)
 *      boolean	isEmpty()
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        // Collection c = new Collection(); 接口是抽象的，无法实例化
        // 多态
        Collection c = new ArrayList();
        // 测试Collection接口中的常用方法
        c.add(1200);// 自动装箱，实际上是放进去了一个对象的内存地址。Integer x = new Integer（1200）；
        c.add(3.14);// Double d = new Double(3.14);
        c.add(new Object());
        c.add(new Student());
        c.add(true);

        // 获取集合中元素的个数
        System.out.println("集合中元素的个数" + c.size());

        // 清空集合
        c.clear();
        System.out.println("集合中元素的个数" + c.size());

        // 再向集合中添加元素
        c.add("Hello");
        c.add("World");
        System.out.println(c.contains("Hello"));
        System.out.println(c.contains("world"));

        // 删除集合中某个元素
        c.remove("World");
        c.remove(1);// 可以尝试删除不存在的元素
        System.out.println("集合中元素的个数" + c.size());    

        //判断集合是否为空
        boolean flag = c.isEmpty();
        System.out.println(flag);
        c.clear();
        System.out.println(c.isEmpty());

        c.add("abc");
        c.add("def");
        c.add(1);

        //转化为数组
        Object[] obj = c.toArray();
        for(int i = 0; i < obj.length; i++){
            System.out.println(obj[i]);
        }
    }
}
class Student{

}