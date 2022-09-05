package advance.integer;
/* 
 * 在JDK1.5后，支持自动装箱和拆箱了
 *  自动装箱：基本数据类型自动转换成包装类
 *  自动拆箱：包装类自动转换成基本数据类型
 *  
 * 有了自动拆箱后，Number类中的方法就用不着了
 * 
 * 自动装箱和自动拆箱的好处就是为了方便编程
 */
public class IntegerTest05 {
    public static void main(String[] args) {
        //自动装箱
        //100是基本数据类型
        //x是包装类型
        Integer x = 100;

        //自动拆箱
        //x是包装类型
        //y是基本数据类型
        int y = x;

        Integer z = 1000;
        //分析这个为什么没有报错
        //自动拆箱
        //+要求两边都是基本数据类型的数字，z是包装类，不属于基本数据类型，这里会进行自动拆箱。将z转换成基本数据类型
        System.out.println(z + 1);

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b);

    }
        
    
}
