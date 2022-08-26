package advance.shuzu;
/*
 * main方法上的String[] args有什么用
 *  分析：谁负责调用main方法（JVM）
 *  JVM调用main方法的时候，会自动传一个String数组过来
 */
public class ArrayTest05 {
    public static void main(String[] args) {

        //JVM默认传递过来的数组对象的长度 
        //通过测试得出：args不是null
        System.out.println("jvm传递过来的String数组参数，这个数组的长度是？" + args.length);//0

        //这个数组什么时候里面会有值呢
        //这个数组是留给用户的，用户可以在控制台上输入参数，这个参数会自动被转换为“String[] args”
        //例如：java ArrayTest05 abc def xyz
        //那么这个时候JVM会自动将abc def xyz通过空格的方式进行分离，分离完成之后，自动放到“String[] args”数组
        //所以main方法上面的String[] args数组主要是用来接收用户输入参数的

    }
}
