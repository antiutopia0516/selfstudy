package advance.collections.map.treeset;

import java.util.TreeSet;

/* 
 * 对自定义的类型来说TreeSet可以排序吗
 *  以下程序对于Person来说，无法排序，因为没有指定Person对象之间的比较规则
 *  谁大谁小并没有说明
 * 
 *  以下程序运行的时候出现了这个异常：
 *  class advance.collections.map.treeset.Person cannot be cast to class java.lang.Comparable
 */



public class TreeSetTest04 {
    public static void main(String[] args) {
        Customer p1 = new Customer(10);
        Customer p2 = new Customer(20);
        Customer p3 = new Customer(12);

        TreeSet<Customer> ts = new TreeSet<>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);

        for (Customer customer : ts) {
            System.out.println(customer);
        }
    }
    
}

// 放在TreeSet中的元素需要实现java.lang.Comparable接口
// 并且实现compareTo方法，equals可以不写
class Customer implements Comparable<Customer>{
    int age;
    public Customer(int age){
        this.age = age;
    }

    // 需要在这个方法中编写比较的逻辑和规则
    // k.compareTo(t.key)
    // 拿着参数k和集合中的每一个k进行比较，返回值可能是大于0，小于0，等于0
    // 比较规则最终还是由程序员指定的：例如按照年龄升序，按照年龄降序
    @Override
    public int compareTo(Customer o) { //c1.compareTo(c2)
        // this是c1
        // c是c2
        // c1和c2比较的时候，就是this和c比较

        return this.age - o.age;
    }

    public String toString(){
        return "Customer" + age;
    }

    
}