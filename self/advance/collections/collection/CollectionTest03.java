package advance.collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c1 = new ArrayList<>();
        // 添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        // 迭代集合
        Iterator it = c1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
