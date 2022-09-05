package advance.integer;
/* 
 * 关于Integer类的构造方法，有两个：
 *  Integer（int）
 *  Integer （String）
 */
public class IntegerTest03 {
    public static void main(String[] args) {

        //Java9之后不建议使用这个构造方法了。出现横线表示已过时
        //将数字100转换成包装类型
        Integer x = new Integer(100);
        System.out.println(x);

        //将String类型的数字，转换成Integer类型
        Integer y = new Integer("12");
        System.out.println(y);

        //double --> Double
        Double d = new Double(1.23);

        //String --> Double
        Double e = new Double("3,14");
    }
}
