package advance.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
 * 测试List接口中常用方法
 *  1、List集合存储元素特点：有序可重复
 *      有序：List集合的元素有下标
 *      从0开始，以1递增
 *      可重复：存储一个1，可以再存储1
 *  2、List既然是Collection的子接口，那么肯定List接口有自己“特色”的方法：
 *      以下只列出List接口特有的常用的方法：
 *          void	add(int index, E element)
 *          get(int index)
 *          int	indexOf(Object o)
 *          int	lastIndexOf(Object o)
 * 	        remove(int index)
 *          set(int index, E element)
 */
public class ListTest01 {
    public static void main(String[] args) {
        // 创建List类型的集合
        List myList = new ArrayList();

        // 添加元素
        myList.add("A");// 默认都是向集合末尾添加元素
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");

        // 在列表指定位置添加指定元素
        // 这个方法使用的不多，效率较低
        myList.add(1, "King");

        Iterator it = myList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 根据下标获取元素
        Object firstObject = myList.get(0);
        System.out.println(firstObject);

        // 因为有下标，所以List集合有自己比较特殊的遍历方式
        // 通过下标遍历
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        // 获取指定对象第一次出现处的索引
        System.out.println(myList.indexOf("King"));// 1
        System.out.println(myList.indexOf("C"));// 3

        // 获取指定对象最后一次出现处的索引
        System.out.println(myList.lastIndexOf("C"));// 4

        // 删除指定下标位置的元素
        // 删除下标为0的元素
        myList.remove(0);
        System.out.println(myList.size());// 5

        // 修改指定位置的元素
        myList.set(2, "soft");

        System.out.println("=================");

        // 遍历集合
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
