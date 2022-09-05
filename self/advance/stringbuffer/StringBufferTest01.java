package advance.stringbuffer;
/* 
 * 我们在实际的开发中，如果需要进行字符串的频繁拼接，会有什么问题
 * 因为java中的字符串是不可变的，每一次拼接都会产生新字符串
 * 这样会占用大量的内存，造成内存空间的浪费
 * 如果以后需要进行大量字符串的拼接操作，建议使用JDK中的
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        //拼接字符串，以后拼接字符串统一调用append()方法
        stringBuffer.append(100);
        stringBuffer.append("asdasd");
        stringBuffer.append(true);
        System.out.println(stringBuffer);

    }
}
