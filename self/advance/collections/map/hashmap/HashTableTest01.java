package advance.collections.map.hashmap;

import java.util.Hashtable;
import java.util.Map;

/* 
 * Hashtable的key可以为null吗
 *  Hashtable的key和value都是不能为null的
 *  HashMap的key和value都是可以为null的
 * 
 * Hashtable的方法都带有synchronized：线程安全的
 * 线程安全有其他的方案，这个Hashtable对线程的处理导致效率较低，使用较少
 * 
 * Hashtable和HashMap一样，底层都是哈希表数据结构
 */
public class HashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable<>();
        map.put(null, 123);// java.lang.NullPointerException

    }
}
