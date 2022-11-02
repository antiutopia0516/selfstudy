package advance.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;// JUC包下的，属于java的并发包，老JDK中没有这个包，新特性

/* 
 * 实现线程的第三种方式
 *  实现callable接口
 */
public class ThreadTest15 {
    public static void main(String[] args) throws Exception{
        FutureTask task = new FutureTask<>(new Callable() {
            @Override
            public Object call() throws Exception{
                // 线程执行一个任务，执行之后可能会有一个执行结果
                // 模拟执行
                System.out.println("call method begin");
                Thread.sleep(1000 * 10);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });

        // 创建线程对象
        Thread t = new Thread(task);

        t.start();

        // 这里是main方法，是在主线程中
        // 在主线程中，怎么获取t线程的返回结果
        Object obj = task.get();
        System.out.println("线程执行结果" + obj);

        // main方法这里的程序想要执行必须等待get方法的结束
        // 而get方法可能需要等很久。因为get方法是为了拿到另一个线程的执行结果
        // 另一个线程执行是需要时间的
        System.out.println("hello world");
    }
}
