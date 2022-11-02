package advance.thread;
/* 
 * 1、怎么获取当前线程对象
 *  static Thread currentThread()
; * 2、获取线程对象的名字
 *  线程对象.getName();
 * 
 * 3、修改线程对象的名字
 *  线程对象.setName("线程名字")
 * 
 * 4、当线程没有设置名字的时候，默认的名字有什么规律？
 *  Thread-0
 *  Thread-1
 *  Thread-2
 */
public class ThreadTest05 {
    public static void main(String[] args) {

        // currentThread就是当前线程对象
        // 这个代码出现在main方法中，所以当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());
        // 创建线程对象
        MyThread2 t = new MyThread2();
        // 设置线程的名字
        //t.setName("tttt");
        // 获取线程的名字
        System.out.println(t.getName());// 默认名Thread-0
        // 启动线程
        //t.start();

        MyThread2 t2 = new MyThread2();
        System.out.println(t2.getName());// 默认名Thread-1
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int index = 0; index < 100; index++) {
            System.out.println("分支线程-->" +  index);
        }
    }
}
