package advance.integer;

public class IntegerTest06 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);//false

        /* 
         * java中为了提高程序的执行效率，将-128到127之间所有的包装对象提前创建好
         * 放到了一个方法区的整数型常量池中了，目的是只要用这个区间的的数字就不需要再new了，可以直接从整数型常量池取出来
         */
        Integer x = 127;
        Integer y = 127;
        //==永远判断的都是两个对象的内存地址是否相同
        System.out.println(x == y);//true
    }
}
