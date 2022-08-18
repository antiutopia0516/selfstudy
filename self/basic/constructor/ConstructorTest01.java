package basic.constructor;
/**
 * 构造方法语法结构：
 * [修饰符列表] 构造方法名（形式参数列表）{
 *      构造方法体；
 * }
 * 
 * 普通方法语法结构：
 * [修饰符列表] 返回值类型 方法名（形式参数列表）{
 *      方法体；
 * }
 * 
 * 对于构造方法来说，“返回值类型”不需要指定，并且也不能写void，只要写上void，这个方法就成为普通方法了
 * 
 * 对于构造方法来说，构造方法的方法名必须和类名保持一致
 * 
 * 构造方法的作用：
 * -构造方法存在的意义是，通过构造方法的调用，可以创建对象。
 * 
 * 构造方法应该怎么调用：
 * -普通方法是这样调用的：方法修饰符中有static时：类名.方法名（实参列表）/方法修饰符中没有static时：引用.方法名（实参列表）
 * -new 构造方法名（实参列表）
 * 
 * 每个构造方法实际执行后都有返回值。构造方法结束的时候java程序自动返回值
   返回值类型是构造方法所在类的类型
   
   当一个类中没有定义任何构造方法的话，系统默认给该类提供一个无参数的构造方法，这个构造方法被称为缺省构造器

   当一个类提供了构造方法，系统就不再提供无参数的构造方法了（缺省构造器。建议开发中手动为当前类提供无参数构造方法。因为无参数构造方法太常用了

   构造方法支持重载机制，在一个类中编写多个构造方法，这多个构造方法显然构成方法重载机制
*/
public class ConstructorTest01 {

    public static void main(String[] args) {
        // 以下程序创建了四个对象，只要构造函数就会创建对象，并且一定是在“堆内存”中开辟空间
        User u = new User();
        User u1 = new User(10);
        User u2 = new User("顾纾鸿");
        User u3 = new User(10, "顾纾鸿");

        // 调用带有static的方法
        ConstructorTest01.doSome();
        doSome();

        // 调用没有static的方法
        ConstructorTest01 t = new ConstructorTest01();
        t.doOther();
    }

    public static void doSome(){
        System.out.println("dosome");
    }

    public void doOther(){
        System.out.println("do other");
    }
}