package advance.string;

public class StringTest03 {
    public static void main(String[] args) {
        //String类当中的常用方法

        //1、char charAt(int index)
        char c = "中国人".charAt(1);//"中国人"是一个字符串String对象
        System.out.println(c);

        //2、public int compareTo(String anotherString)
        System.out.println("abc".compareTo("abc"));

        //3、public boolean contains(CharSequence s)
        //判断前面的字符串是否包含后面的字符串
        System.out.println("HelloWorld".contains("Hello"));
        
        //4、 boolean endsWith(String suffix)
        //判断当前字符串是否已某个字符结尾
        System.out.println("test.txt".endsWith(".java"));
        System.out.println("test.txt".endsWith(".txt"));

        //5、 boolean.equalsIngoreCase(String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写
        System.out.println("ABc".equalsIgnoreCase("abc"));

        //6、byte[] getBytes()
        //将字符串对象转换成byte数组
        byte[] bytes = "abcdef".getBytes();
        for(int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }

        //7、 int indexOf(String str)
        //判断某个子字符串在当前字符串中第一次出现处的索引
        System.out.println("oraclejavac++javaoreaclec++".indexOf("java")); 

        //8、 boolean isEmpty()
        //判断某个字符串是否为空
        String s = "";
        System.out.println(s.isEmpty());

        //9、 int lastIndexOf(String str)
        //判断某个字符串在当前字符串中最后一次出现的索引
        System.out.println("oraclejavac++javaoreaclec++".lastIndexOf("java")); 
    }
    
}
