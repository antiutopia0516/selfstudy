package advance.exception;
/* 
 * final fianlly fianlize区别
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        // final是一个关键字。表示最终的，不变的
        final int i = 100;
        //i = 200;

        // fianlly也是一个关键字，和try联合使用，使用在异常机制处理中
        // 在fianlly中的代码一定会执行
        try{

        }finally{
            System.out.println("fianlly");
        }

        // finalize()是Object类中的一个方法。作为方法名出现
        // 所以fianlize是标识符
        
    }
}
