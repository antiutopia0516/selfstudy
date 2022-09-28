package advance.collections.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
 * JDK之后引入了：自动类型推断机制。（又称为钻石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {
        // ArrayList<这里的类型会自动推断>(),前提是JDK8之后
        // 自动类型推断
        List<Animal> myList = new ArrayList<>();

        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        // 遍历
        Iterator<Animal> it = myList.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            a.move();
        }

        List<String> strList = new ArrayList<>();
        // 类型不匹配
        //strList.add(new Cat());
        strList.add("abc");

        // 遍历
        Iterator<String> it2 = strList.iterator();
        while(it2.hasNext()){
            String s = it2.next();
            System.out.println(s.substring(1));
        }
    }
}
