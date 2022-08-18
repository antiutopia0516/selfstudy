package advance.Super.test01;


/* 
 * 1、super是一个关键字，全部小写。
 * 2、super和this对比着学习
 *  this：
 *      this能出现在实例方法和构造方法中
 *      this的语法是："this."、"this()"
 *      this不能使用在静态方法中
 *      this.大部分情况是可以省略的
 *      this.什么时候不能省略？ 在区分局部变量和实例变量的时候不能省略
 *      this()只能出现在构造方法的第一行，通过当前的构造方法去调用“本类”中其他的构造方法，目的是代码复用
 * 
 *  super：
 *      super能出现在实例方法和构造方法中
 *      this的语法是："super."、"super()"
 *      super不能使用在静态方法中
 *      super.大部分情况是可以省略的
 *      this.什么时候不能省略？ 
 *      this()只能出现在构造方法的第一行，通过当前的构造方法去调用“父类”中其他的构造方法，目的是创建子类对象的时候，先初始化父类特征
 * 
 *  super()
 *      表示通过子类的构造方法调用父类的构造方法，要想有儿子，必须先有父亲
 * 
 *  重要结论：
 *      当一个构造方法第一行：
 *          即没有this（）又没有super（），默认会有一个super（）
 *          表示通过当前子类的构造方法调用父类的构造方法。
 *          所以要保证父类的无参数构造方法是存在的
 */

public class SuperTest01 {
    public static void main(String[] args) {
        //A类的无参数构造方法
        //B类的无参数构造方法
        new B();
    }
}
class A {
    public A(){
        System.out.println("A类的无参数构造方法");
    }
}

class B extends A {
    public B(){
        System.out.println("B类的无参数构造方法");
    }
}