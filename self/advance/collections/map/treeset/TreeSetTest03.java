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



public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1 = new Person(10);
        Person p2 = new Person(20);
        Person p3 = new Person(12);

        TreeSet<Person> ts = new TreeSet<>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);

        for (Person person : ts) {
            System.out.println(person);
        }
    }
    
}

class Person{
    int age;

    public Person(int age){
        this.age = age;
    }

    // 重写toString方法
    public String toString(){
        return "Person[age =" + age + "]";
    }
}