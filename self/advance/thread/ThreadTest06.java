package advance.thread;
/* 
 * 关于线程的sleep方法
 *  static void sleep(long millis)
 * 1、静态方法
 * 2、参数是毫秒
 * 3、作用：让当前线程进入休眠，进入"阻塞状态"，放弃占有的CPU时间片，让给其他线程使用
 */
public class ThreadTest06 {
    public static void main(String[] args) {

        // 让当前线程进入休眠，持续5秒
        // 当前线程是主线程
        /* try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // 5秒之后执行这里的代码
        System.out.println("HelloWorld");
        */
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            // 睡眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        
    }
} 
