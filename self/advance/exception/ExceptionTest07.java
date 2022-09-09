package advance.exception;
/* 
 * 异常对象有两个非常重要的方法:
 *  
 *  获取异常简单的描述信息：
 *      String msg = exception.getMessage();
 *  
 *  打印异常追踪的堆栈信息：
 *      exception.printStackTrace();
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        // 这里是为了测试getMessage()方法和printStackTrace()方法
        // 这里只是new了异常对象，没有将异常对象抛出。JVM会认为这是一个普通对象
        NullPointerException e = new NullPointerException("空指针异常");

        // 获取异常简单信息
        String msg = e.getMessage();
        System.out.println(msg);

        // 打印异常堆栈信息
        // java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的
        e.printStackTrace();

        System.out.println("Hello World");
    }
}
