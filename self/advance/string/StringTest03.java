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
        
        // replace(char oldChar, char newChar)
        // replace(CharSequence target, CharSequence replacement)
        // String的父接口就是：CharSequence
        //替换
        String str = "http://www.baidu.com".replace("http:", "https:");
        System.out.println(str);
        //把以下字符串的等号替换成冒号
        String str1 = "name=zhangsan&password=123age=20".replace("=", ":");
        System.out.println(str1);

        // split(String regex)
        // 拆分字符串
        String[] ymd = "1980-10-11".split("-");//将这个字符串以”-“进行拆分
        for(int i = 0; i < ymd.length; i++){
            System.out.println(ymd[i]);
        }

        // startsWith(String prefix)
        // 判断某个字符串是否以某个子字符串开始
        System.out.println("test.txt".startsWith("test"));
        System.out.println("test.txt".startsWith(".txt"));

        // substring(int beginIndex, int endIndex)
        // 截取字符串
        //beginIndex(包括)
        //endIndex(不包括)
        System.out.println("www.baidu.com".substring(4));
        System.out.println("www.baidu.com".substring(4, 9));

        // char[] = toCharArray()
        // 将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }

        // String toLowerCase()
        // 转换为小写
        System.out.println("AbCBHDCCdsdjcnD".toLowerCase());

        // String toUpperCase()
        // 转换为大写
        System.out.println("asdhuCHUDhcudsc".toUpperCase());

        // trim()
        // 去除字符串前后空白
        System.out.println("         hello            world      ".trim());//hello            world

        // String中只有一个方法是静态的，不需要new对象
        // 将非字符串转换成字符串
        // valueOf
        String s1 = String.valueOf(true);
        String s2 = String.valueOf(3.14);
        System.out.println(s1 + s2);

        //println源代码
        //本质上System.out.println（）这个方法在输出任何数据的时候都是先转换成字符串，再输出
        System.out.println(100);
        
    }
    
}
