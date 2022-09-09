package advance.enum1;
/* 
 * 分析一下程序，在设计方面有什么缺陷
 */
public class EnumTest01 {
    public static void main(String[] args) {
        boolean success = divide(10, 2);
        System.out.println(success ? "运算成功" : "运算失败");
    }


    /**
     * 以下程序，计算两个int类型数据的商，计算成功返回1，计算失败返回0
     * @param a int
     * @param b int
     * @return 返回1表示成功，返回0表示失败
     */

    // 设计缺陷？在这个方法的返回值类型上，返回一个int不恰当
    // 既然最后的结果只能是成功和失败，最好使用boolean
    /* public static int divide(int a, int b){
        try{
            int c = a / b;
            // 程序执行到这里表示以上代码没有发现异常，表示执行成功

            // 返回值10已经偏离了需求，实际上可能已经出错，但是编译器没有检查出来
            // 要尽可能的让编译器发现错误
            return 10;
        }catch(Exception e){
            // 程序执行到这里表示以上程序出现了异常
            // 表示执行失败
            return 0;
        }
        
    } */

    public static boolean divide(int a, int b){
        try{
            int c = a / b;
            // 程序执行到这里表示以上代码没有发现异常，表示执行成功

            // 返回值10已经偏离了需求，实际上可能已经出错，但是编译器没有检查出来
            // 要尽可能的让编译器发现错误
            return true;
        }catch(Exception e){
            // 程序执行到这里表示以上程序出现了异常
            // 表示执行失败
            return false;
        }
    }

    /* 
     * 以上的这个方法设计的没毛病，返回true和false两种情况
     * 但是在以后的开发中，有可能遇到一个方法执行的结果可能包括三种情况，
     * 四种情况等。但是每一个都是可以数清楚的，一枚一枚都是可以列举出来的。
     * 这个boolean就无法满足需求了。此时需要使用java语言中的枚举类型
     */
}
