package advance.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest02 {
    public static void main(String[] args) {
        Map map = new HashMap<>();

        // HashMap集合允许key为null
        map.put(null, null);
        System.out.println(map.size());

        // key重复的话value覆盖
        map.put(null, 100);
        System.out.println(map.size());

        // 通过key获取value
        System.out.println(map.get(null));
    }
}
