package advance.integer;
/* 
 * 8中基本数据类型对应的包装类型名是什么
 *  基本数据类型            包装类
 * -------------------------------
 *  byte                java.lang.Byte(父类Number)
 *  short               java.lang.Short(父类Number)
 *  int                 java.lang.Integer(父类Number)
 *  long                java.lang.Long(父类Number)
 *  float               java.lang.Float(父类Number)
 *  double              java.lang.Double(父类Number)
 *  boolean             java.lang.Boolean(父类Object)
 *  char                java.lang.Character(父类Object)
 * 
 * 2、以上八个包装类，重点以java.lang.Integer为代表进行学习，其他依葫芦画瓢就行
 * 
 * 3、八种包装类中其中六个都是数字对应的包装类，他们的父类都是Number，可以先研究一下Number中的公共方法
 *      Number是一个抽象类
 *      Number这个类中有这样的方法：
 *          byte	byteValue()
            Returns the value of the specified number as a byte, which may involve rounding or truncation.
            abstract double	doubleValue()
            Returns the value of the specified number as a double, which may involve rounding.
            abstract float	floatValue()
            Returns the value of the specified number as a float, which may involve rounding.
            abstract int	intValue()
            Returns the value of the specified number as an int, which may involve rounding or truncation.
            abstract long	longValue()
            Returns the value of the specified number as a long, which may involve rounding or truncation.
            short	shortValue()
            Returns the value of the specified number as a short, which may involve rounding or truncation.
            这些方法其实所有的数字的包装类的子类都有，这些方法是负责拆箱的
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        // 123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
        // 基本数据类型转换为引用数据类型(装箱)
        Integer i = new Integer(123);

        // 将引用数据类型转换成基本数据类型
        float f = i.floatValue();
        System.out.println(f);

        // 将引用数据类型转换为基本数据类型(拆箱)
        int retValue = i.intValue();
    }
}
