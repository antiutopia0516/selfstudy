package advance.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;

/* 
 * Map集合的遍历
 */
public class MapTest02 {
    public static void main(String[] args) {
        // 第一种方式，获取所有的key，通过遍历key来获取value
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");// 1在这里进行了自动装箱
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        // 遍历map集合
        // 先获取所有的key，所有的key是一个set集合
        Set<Integer> keys = map.keySet();
        // 遍历key，通过key获取value
        // 迭代器
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        // foreach
        for(Integer key : keys){
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("=========================");

        // 第二种方式：Set<Map.Entry<K,V>>	entrySet()
        // 以上这个方式是把Map集合直接全部转换成Set集合
        // Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        // 遍历Set集合，每一次取出一个node
        // 迭代器
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        while(it2.hasNext()){
            Map.Entry<Integer,String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("=========================");

        for (Map.Entry<Integer,String> entry : set) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
            System.out.println(entry);
        }

    }
}
