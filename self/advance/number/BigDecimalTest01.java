package advance.number;

import java.math.BigDecimal;

/* 
 * 1、BigDecimal 大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）这是SUN提供的一个类。专门用在财务软件中
 * 
 * 2、注意：财务软件中double是不够的
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {

        //这个100不是普通的100，是精度极高的100
        BigDecimal v1 = new BigDecimal(100);

        //精度极高的200
        BigDecimal v2 = new BigDecimal(200);

        //求和
        //v1和v2都属于引用数据，不能直接使用+求和
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);

        BigDecimal v4 = v2.divide(v1);
        System.out.println(v4);
    }
}
