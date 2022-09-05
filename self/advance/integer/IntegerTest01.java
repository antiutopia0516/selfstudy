package advance.integer;
/* 
 * 1、java中为八种基本数据类型又对应准备了八种包装类。八种包装类属于引用数据类型，父类是Object
 * 
 * 2、为什么要提供八种包装类
 *  因为八种基本数据类型不够用。
 *  所以SUN又提供了对应的八种包装类型
 * 
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        //有没有这种需求：调用doSome方法的时候需要传一个数字进去
        //但是数字属于基本类型，而doSome方法参数的类型是Object
        //可见doSome方法无法接收基本数据类型的数字。那怎么办呢？可以传一个数字对应的包装类进去
        doSome(1);
    }

    public static void doSome(Object obj){
        System.out.println(obj);
    }
}
