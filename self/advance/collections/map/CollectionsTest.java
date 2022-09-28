package advance.collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
 * java.util.Collection 集合接口
 * java.util.Collections 集合工具类
 */
public class CollectionsTest {
    public static void main(String[] args) {
        // ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();

        // 变成线程安全的
        Collections.synchronizedList(list);

        // 排序
        list.add("abc");
        list.add("abz");
        list.add("abf");
        list.add("abx");

        for (String string : list) {
            System.out.println(string);
        }
        Collections.sort(list);

        for (String string : list) {
            System.out.println(string);
        }
    }
}
