package advance.exception;
/*
 * 什么是异常，java提供异常处理机制有什么用？
 *  以下程序执行过程中发生了不正常的情况，而这种不正常的情况叫做异常
 *  java语言是很完善的，提供了异常的处理方式，以下程序执行过程中出现了不正常情况
 *  java把该异常信息打印输出到控制台，供程序员参考。程序员看到异常信息后，可以对程序进行修改，让程序更加健壮。
 * 
 * 异常：程序执行过程中的不正常情况
 * 异常的作用：提高程序的健壮性
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        /* int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println(c); */

        // 我观察到异常信息后，对程序进行修改，更加健壮
        int a = 10;
        int b = 0;
        if(b == 0){
            System.out.println("除数不能为0");
            return;
        }

        int c = a / b;
        System.out.println(c);
    }
}
