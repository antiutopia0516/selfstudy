package basic.This.test001;
/*
 * 关于java语言中this关键字
 * 
 * this是一个关键字
 * this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身，this储存在JVM堆内存java对象内部
 * 创建100个java对象，就有100个this变量
 * this可以出现在实例方法中，指向当前正在执行这个动作的对象
 * this在多数情况下是可以省略不写的
 * this不能使用在带有static的方法中
 */
public class Customer {
    
    //姓名「堆内存的对象内部存储，所以访问该数据的时候必须先创建对象」
    String name = "gsh";

    //构造方法
    public Customer(){

    }

    //不带有static关键字的方法
    //顾客购物的行为
    //每一个顾客购物的最终结果是不一样的
    //所以购物的行为是属于对象级别的行为
    //由于每一个对象在执行购物这个动作的时候最终结果不同，所以购物这个动作必须有“对象”的参与
    //重点：没有static关键字的方法被称为“实例方法”，实例方法怎么访问？“引用.”
    //重点：没有static关键字的变量被称为“实例变量”
    //注意：当一个行为/动作执行的过程当中是需要对象参与的，那么这个方法一定要定义为“实例方法”，不要带static关键字
    //以下方法定义为实例方法，因为每一个顾客真正购物的时候，最终结果是不同的。所以这个动作必须要有对象的参与
    public void shopping(){
        //当张三在购物的时候，输出“张三在购物”
        //当李四在购物的时候，输出“李四在购物”
        //System.out.println("xxx在购物");

        //System.out.println(name + "在购物");

        //完整写法
        System.out.println(this.name + "在购物");

    }

    //带有static
    public static void doSome(){
        //这个执行过程中没有“当前对象”，因为带有static的方法是通过类名的方式访问的
        //或者说这个“上下文“当中没有”当前对象“，自然也不存在this

        //以下程序为什么编译错误？
        //doSome方法调用的不是对象去调用，是一个类名去调用，执行过程中没有“当前对象”
        //name是一个“实例对象”，以下代码的含义是：访问当前对象的name，没有当前对象，自然也不能访问当前对象的name
        //static的方法调用不需要对象，直接使用类名，所以执行过程中没有当前对象，所以不能使用this
        //System.out.println(name);
    }

    public static void doOther(){
        //假设想访问name这个实例变量怎么做

        //可以采用以下方案，但是以下方案，绝对不是访问的当前对象的name
        //创建对象
        Customer c = new Customer();
        System.out.println(c.name);//这里访问的name是c引用指向的name
    }

}
