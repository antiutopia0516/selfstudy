package advance.thread;

public class ThreadTest07 {
    public static void main(String[] args) {
        // 创建线程对象
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        // 调用sleep方法
        try {
            t.sleep(1000 * 5);// 在执行的时候还是会转换成Thread.sleep(1000 * 5)
                              // 这行代码的作用是：让当前线程进入睡眠，也就是说main线程进入休眠
                              // 这样代码出现在main方法中，main线程睡眠
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 5秒后这里才会执行
        System.out.println("HelloWorld");
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}