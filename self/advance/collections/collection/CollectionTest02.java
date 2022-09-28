package advance.collections.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Collection;

/*
 * 关于集合遍历/迭代
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        // 以下讲解的遍历/迭代方式是所有Collection通用的一种方式
        // 在map集合中不能用。在所有的Collection和其子类中使用
        // 创建集合对象
        Collection c = new HashSet();// 后面的集合无所谓，主要是看前面的Collection
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        // 对集合Collection进行迭代/遍历
        // 第一步：获取集合对象的迭代器Iterator
        Iterator it = c.iterator();
        // 通过以上获取的迭代器对象开始迭代/遍历集合
        /* 
         * boolean	hasNext() 如果迭代具有更多元素，则返回 true 。
         * Object next()返回迭代中的下一个元素。
         */
        /* boolean hasNext = it.hasNext();
        if(hasNext){
            // 不管当初存进去什么，取出时统一都是Object
            Object obj = it.next();
            System.out.println(obj); 
        }*/

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
