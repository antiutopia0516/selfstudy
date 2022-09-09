package advance.enum1;
/*
 * 枚举是一种引用数据类型
 * 
 * 枚举类型怎么定义，语法是？
 *  enum 枚举类型名{
 *      枚举值1，枚举值2
 * }
 * 
 * 结果只有两种情况的，建议使用布尔类型
 * 结果超过两个并且还是可以一个一个列举出来的，建议使用枚举类型
 */
// 采用枚举的方式改造程序
public class EnumTest02 {
    public static void main(String[] args) {
        Result r = divide(10, 0);
        System.out.println(r == Result.SUCCESS ? "计算成功" : "计算失败");
    }
    /**
     * 计算两个int类型数据的商
     * @param a int整数
     * @param b int整数
     * @return Result.SUCCESS表示成功 Result.FAIL表示失败
     */
    public static Result divide(int a, int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch(Exception e){
            return Result.FAIL;
        }
    }
}

// 枚举：一枚一枚可以列举出来的，才建议使用枚举类型
// 枚举编译后生成的也是class文件
// 枚举也是一种引用数据类型
// 枚举中的每一个值都可以看做一个常量
enum Result{
    // SUCCESS 是枚举Result类型中的一个值
    // FAIL 是枚举Result类型中的一个值
    // 枚举中的每一个值，都可以看作是常量
    SUCCESS,FAIL
}
