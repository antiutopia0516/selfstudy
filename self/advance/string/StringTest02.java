package advance.string;
/*
 * 关于String类中的构造方法
 */
public class StringTest02 {
    public static void main(String[] args) {
        
        //创建字符串对象最常用的方法
        String s1 = "Hello World";
        //按说以下该输出一个内存地址
        //但输出了一个字符串，说明String类已经重写了toString方法
        System.out.println(s1);//Hello World

        //这里只掌握最常用的构造方法
        byte[] bytes = {97, 98, 99};
        String s2 = new String(bytes);

        //这里会输出内存地址吗
        //输出一个引用的时候，会自动调用toString方法，默认Object的话，会自动输出对象的内存地址
        //通过输出结构可以得出结论：String类已经重写了toString方法
        //输出字符串对象的话，输出的不是对象的内存地址，而是字符串本身
        System.out.println(s2.toString());//abc
        System.out.println(s2);//abc

        //String(字节数组，数组元素下标的起始位置，长度)
        //将byte数组中的一部分转换成字符串
        String s3 = new String(bytes, 1, 2);
        System.out.println(s3);//bc

        //将char数组全部转换成字符串
        char[] chars ={'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);

        //将char数组的一部分转换成字符串
        String s5 = new String(chars, 2, 3);
        System.out.println(s5);
    }
}
