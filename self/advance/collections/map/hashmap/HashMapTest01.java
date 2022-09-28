package advance.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* 
 * HashMap集合：
 *  1、HashMap集合底层是哈希表的数据结构
 *  2、哈希表是一个怎么样的数据结构呢？
 *      哈希表是一个数组和单向链表的结合体。
 *      数组：在查询方面效率很高，随机增删方面效率很低
 *      单向链表：在随机增删方面效率较高，在查询防线效率很低
 *      哈希表将以上的两种数据结构融合在一起，充分发挥他们各自的优点
 *  3、哈希表：是一个一维数组，这个数组中的每一个元素都是一个单向链表（数组和链表的结合体）
 *  4、最主要掌握的是：
 *      map.put(k,v)
 *      v = map.get(k);
 *      以上两个方法的实现原理是必须要掌握的
 * 
 *  map.put(k,v)实现原理：
 *      第一步：现将k，v封装到Node对象当中。
 *      第二步：底层会调用k的hashCode()方法得出hash值
 *      然后通过哈希函数/哈希算法，将哈希值转换成数组的下标，下标位置上如果没有任何元素，就把Node添加到这个位置上。
 *      如果说下标对应的位置上有链表，此时会拿着k和链表上的每一个节点中的k进行equals，如果所有的equals方法返回的都是false，那么这个新节点
 *      将被添加到链表的末尾
 *      如果有哪个位置返回了true，那么那个位置的v将会被替代
 * 
 *  v = map.get(k)实现原理：
 *      先调用k的hashcode()方法得出哈希值，再通过哈希算法转换成数组下标，通过数组下标快速定位到某个位置上，如果这个位置什么都没有，返回null。
 *      如果这个位置上有单向链表，那么会拿着参数k和单向链表上的每个节点k进行equals，如果所有equals方法返回false，那么get方法返回null。
 *      只要其中有一个节点的k和参数k equals的时候返回true，那么此时这个节点的value就是我们要找的value，get方法最终返回这个要找的value
 * 
 *  5、HashMap集合k部分的特点：
 *      无序，不可重复
 *      为什么无序：因为不一定挂到哪个单向链表上
 *      不可重复是怎么保证的？equals方法来保证HashMap集合的key不可重复
 *      如果key重复了，value会覆盖
 * 
 *      放在HashMapkey部分的元素其实就是放到HashSet集合中了。
 *      所以HashSet集合中的元素也需要同时重写hashCode()+equals()方法
 * 
 *  6、哈希表HashMap使用不当时无法发挥性能！
 *      假设将所有的hashCode()方法返回值固定为某个值，那么会导致底层哈希表变成纯单向链表。
 *      这种情况我们称为散列分布不均匀
 * 
 *  7、重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashcode和equals方法
 *  8、HashMap集合的默认初始化容量是16，默认加载因子为0.75
 *      这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容
 *      重点：HashMap初始化容量必须是2的幂，这也是官方推荐的，因为这是达到散列均匀，为了提高HashMap的检索效率，所必须的
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1111, "zhangsan");
        map.put(6666, "lisi");
        map.put(7777, "wangwu");
        map.put(2222, "zhaoliu");
        map.put(2222, "king");// key重复的时候value会覆盖

        System.out.println(map.size());

        // 遍历map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> entry : set) {
            System.out.println(entry);
        }
    }
}
