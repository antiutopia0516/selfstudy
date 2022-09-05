package advance.integer;

public class IntegerTest07 {
    public static void main(String[] args) {
        // 手动装箱
        Integer x = new Integer(1000);
        // 手动拆箱
        int y = x.intValue();
        System.out.println(y);

        // Integer a = new Integer("123");

        // 编译的时候没有问题，一切都符合java语法，但运行时会出现异常
        // java.lang.NumberFormatException
        // Integer a = new Integer("chinese");

        // 重点方法
        // static parseInt(String s)
        // 静态方法，传参String，返回int
        int retValue = Integer.parseInt("123");
        System.out.println(retValue + 100);

        // 照葫芦画瓢
        double retValue2 = Double.parseDouble("3.14");
        System.out.println(retValue2 + 1);//4.140000000000001 精度问题
    }
}
