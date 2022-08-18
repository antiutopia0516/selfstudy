package basic.Final.test01;
/*
 * 关于java语言当中的final关键字：
 *  1、final是一个关键字，表示最终的，不可变的。
 *  2、final修饰的类无法被继承
 *  3、final修饰的方法无法被覆盖
 *  4、final修饰的变量一旦赋值之后，不可重新赋值
 *  5、final修饰的实例变量必须手动赋值，不能采用系统默认值
 *  6、final修饰的引用一旦指向某个对象之后，不能再指向其他对象，那么被指向的对象不能被垃圾回收器回收
 *  7、final修饰的实例变量是不可变的，这种变量一般和static联合使用，被称为“常量”
 */
public class FinalTest01 {
 

    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        System.out.println(chinese.COUNTRY);
    }
    
}
class Chinese{
    public final String COUNTRY = "中国"; //final修饰的实例变量是不可变的，这种变量一般和static联合使用，被称为“常量”
    //Java规范中要求所有常量的名字全部大写，每个单词之间使用下划线连接

}

