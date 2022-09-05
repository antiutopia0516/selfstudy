package advance.stringbuffer;
/* 
 * java.lang.StringBuilder
 * StringBuffer和StringBuilder的区别
 *  StringBuffer中的方法都有synchronized关键字修饰，表示StringBuffer在多线程环境线运行是安全的
 *  StringBuilder没有，再多线程环境下是不安全的
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {

        //扩容次数越少，效率越高
        //使用StringBuilder也可以完成字符串的拼接
        StringBuilder sb = new StringBuilder();
        sb.append(100);
        sb.append("hello");
        sb.append(true);
    }
}
