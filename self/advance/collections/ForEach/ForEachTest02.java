package advance.collections.ForEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
 * 集合使用foreach
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        // 创建List集合
        List<String> strList = new ArrayList<>();
        // 添加元素
        strList.add("hello");
        strList.add("world");
        strList.add("kitty");

        //遍历
        Iterator<String> it = strList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 使用下标方式（只针对有下标的集合）
        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }

        //使用foreach
        for (String s : strList) {
            System.out.println(s);
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
