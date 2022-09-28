package advance.collections.map.treeset;

import java.util.TreeSet;


/* 
 * 先按照年龄升序，如果年龄一样的再按照姓名排序
 */
public class TreeSetTest05 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsan", 21));
        vips.add(new Vip("zhangsi", 21));
        vips.add(new Vip("king", 18));
        vips.add(new Vip("soft", 17));
        for (Vip vip : vips) {
            System.out.println(vip);
        }
    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip [age=" + age + ", name=" + name + "]";
    }
    /* 
     * compareTo方法返回值很重要
     *  返回0表示相同，value会覆盖
     *  返回>0，会继续在右子树上找
     *  返回<0，会继续在左子树上找
     */
    @Override
    public int compareTo(Vip v) {
        // TODO Auto-generated method stub
        if(this.age == v.age){
            // 年龄相同的按照名字排序
            // 姓名是String类型，可以直接比。调用String方法中的compareTo方法
            return this.name.compareTo(v.name);
        }else{
            return this.age - v.age;
        }
    }

    
}