package basic.Static.test002;
/*
 * 可以使用static关键字来定义“静态代码块”“
 *      1、语法格式
 *          static{
 *                  java语句；
 *          }
 * 
 *      2、静态代码块在类加载时执行，并且只执行一次。
 * 
 *      3、静态代码块在一个类中可以编写多个，并且遵循自上而下的顺序执行。
 * 
 *      4、静态代码块的作用是什么？怎么用？用在哪？什么时候用？
 * 
 *          -这当然和具体的需求有关，例如项目中要求在类加载的时刻/时机执行代码完成日志的记录。
 *           那么这段记录日志的代码就能编写到静态代码块中，完成日志记录。
 * 
 *          -静态代码块是java为程序员准备的一个特殊的时刻，这个特殊的时刻被称为类加载时刻。若希望在此刻执行一段特殊的程序，
 *           这段程序可以直接放到静态代码块中。
 * 
 *      5、通常在静态代码块中完成预备工作，先完成数据的准备工具，例如：初始化链接池，解析XML配置文件......
 */
public class StaticTest01 {

    static{
        System.out.println("类加载1");
    }

    static{
        System.out.println("类加载2");
    }

    static{
        System.out.println("类加载3");
    }

    public static void main(String[] args) {
        System.out.println("main begin");
    }
}
