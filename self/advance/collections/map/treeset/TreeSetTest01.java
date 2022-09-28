package advance.collections.map.treeset;

import java.util.TreeSet;


/* 
 * 1、TreeSet集合底层实际是一个TreeMap
 * 2、TreeMap集合底层是一个二叉树
 * 3、放到TreeSet集合中的元素，等同于放到TreeMap集合中的key部分了
 * 4、TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序
 * 称为：可排序集合
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        // 创建一个TreeSet集合
        TreeSet<String> ts = new TreeSet<>();
        // 添加String
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhangsi");
        ts.add("wangliu");
        // 遍历
        for (String string : ts) {
            // 按照字典顺序，升序
            System.out.println(string);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(200);
        ts2.add(500);
        ts2.add(2300);
        ts2.add(1040);
        ts2.add(10023);
        ts2.add(1010);

        for (Integer integer : ts2) {
            System.out.println(integer);
        }
    }
}

/* 
 * 数据库中有很多数据：
 *  userid name birth
 * -----------------------
 *  1       zs  1980-11-1
 *  2       ls  1980-12-22
 *  3       ww  1981-12-2
 * 
 * 编写程序从数据库当中取出数据，在页面展示用户信息的时候按照生日升序或者降序
 * 这个时候可以使用TreeSet集合，因为TreeSet集合放进去，拿出来就是有顺序的
 */