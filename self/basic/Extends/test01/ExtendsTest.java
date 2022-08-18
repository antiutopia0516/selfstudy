package basic.Extends.test01;
/*
 * 关于java语言的继承：
 *  继承是面向对象三大特征之一，三大特征分别是：封装，继承，多态
 * 
 *  继承基本的作用是：代码复用。但是继承最重要的作用是：有了继承才有了以后的“方法的覆盖”和“多态机制”
 * 
 *  继承语法格式：
 *      [修饰符列表] class 类名 extends 父类名{
 *          类体 = 属性 + 方法
 *      }
 * 
 *  java语言当中的继承只支持单继承，一个类不能同时继承很多类，只能继承一个类。在c++中支持多继承
 * 
 *  关于继承中的一些术语：
 *      B类继承A类，其中：
 *          A类称为：父类、基类、超类、superclass
 *          B类称为：子类、派生类、subclass
 * 
 *  在java语言当中，子类继承父类都继承哪些数据呢？
 *      - 私有的不支持继承
 *      - 构造方法不支持继承
 *      - 其他数据都支持继承
 * 
 *  虽然java语言当中只支持单继承，但一个类也可以间接继承其他类，例如：
 *      C extends B {
 *      }
 *      B extends A {
 *      }
 *      A extends T {
 *      }
 *      C类直接继承B类，但是C类间接继承T A类
 * 
 *  java语言中，假设一个类没有显示的继承任何类，该类默认继承JavaSE库当中提供的java.lang.Object类
 *  java语言中任何一个类中都有Object类的特征
 */


public class ExtendsTest {
    public static void main(String[] args) {
        /* ExtendsTest et = new ExtendsTest();
        String s = et.toString();//引用.实例方法 这里编译通过了，说明可以调用toString方法，ExtendsTest类中有toString方法，从Object类中继承过来的
        System.out.println(s);//Extends.Test01.ExtendsTest@251a69d7
        */
        CreditAccount act = new CreditAccount();
        act.setActno("act-001");
        act.setBalance(-1000.0);
        act.setCredit(0.99);

        System.out.println(act.getActno() + "," + act.getBalance() + "," + act.getCredit());
    }
    
}
