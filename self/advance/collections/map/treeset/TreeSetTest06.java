package advance.collections.map.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/* 
 * TreeSet集合中元素可排序的第二种方式：使用比较器的方式
 * 最终的结论：
 *  放到TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
 *      第一种：放在集合中的元素实现java.lang.Comparable接口
 *      第二种：在构造TreeSet或者TreeMap集合的时候给它传一个比较器对象
 */
public class TreeSetTest06 {
    public static void main(String[] args) {
        // TreeSet<Wugui> wuguis = new TreeSet<>();这样不行，构造方法中没有comparator
        // 给构造方法传递一个比较器
        // TreeSet<Wugui> wuGuis = new TreeSet<>(new WuguiComparator());

        // 大家可以使用匿名内部类的方式
        TreeSet<Wugui> wuGuis = new TreeSet<>(new Comparator<Wugui>(){

            @Override
            public int compare(Wugui o1, Wugui o2) {
                // TODO Auto-generated method stub
                return o1.age - o2.age;
            }
            
        });

        wuGuis.add(new Wugui(1000));
        wuGuis.add(new Wugui(1800));
        wuGuis.add(new Wugui(128));

        for (Wugui wugui : wuGuis) {
            System.out.println(wugui);
        }
    }
}

// 乌龟
class Wugui {
    int age;

    public Wugui(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wugui [age=" + age + "]";
    }

    
}

// 单独在这里编写一个比较器
// 比较器实现java.util.Comparator接口(Comparable是java.lang包下的。Comparator是java.util包下的)
/* class WuguiComparator implements Comparator<Wugui>{

    @Override
    public int compare(Wugui o1, Wugui o2) {
        // TODO Auto-generated method stub
        return o1.age - o2.age;
    }
    
} */