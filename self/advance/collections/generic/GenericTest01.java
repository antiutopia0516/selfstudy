package advance.collections.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* 
 * 泛型这种语法机制，只在编译阶段起作用，只是给编译器参考的
 * 
 * 使用了泛型的好处是什么？
 *  第一：集合中存储的元素统一了
 *  第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”
 * 
 * 泛型的缺点是什么？
 *  导致集合中存储的元素缺乏多样性
 *  大多数业务中，集合中元素的类型还是统一的。所以这种泛型特性被大家所认可
 */
public class GenericTest01 {
    public static void main(String[] args) {
        // 不使用泛型机制，分析程序存在缺点
        /* List myList = new ArrayList();

        // 准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        // 将对象添加到集合中
        myList.add(c);
        myList.add(b);

        // 遍历集合，取出Cat让它抓老鼠，取出Bird让它飞
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj instanceof Cat){
                Cat cat = (Cat)obj;
                cat.catchMouse();
            }
            if(obj instanceof Bird){
                Bird bird = (Bird)obj;
                bird.fly();
            }
        } */

        // 使用泛型机制
        // 使用泛型List<Animal>之后，表示List集合中只能存储Animal类型的数据
        // 用泛型来指定集合中存储的数据类型
        List<Animal> myList = new ArrayList<Animal>();

        // 指定List集合中只能存储Animal，那么存储Integer就报错了
        // 这样用了泛型后，集合中元素的数据类型更统一了
        // myList.add(1);

        // 准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        // 将对象添加到集合中
        // 都是Animal的子类
        myList.add(c);
        myList.add(b);

        // 获取迭代器
        // 这个表示迭代器迭代的是Animal类型
        Iterator<Animal> it = myList.iterator();
        while(it.hasNext()){
            // 使用泛型之后，每一次迭代返回的数据都是Animal类型
            Animal a = it.next();
            a.move();

        }
    }
}

class Animal{
    public void move(){
        System.out.println("        动物在移动       ".trim());
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟会飞");
    }
}