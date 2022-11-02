package advance.thread;
/* 
 * 在java中怎么强行终止一个线程
 *  这种方式存在很大的缺点，容易丢失数据。因为这种方式是直接将线程杀死了，线程没有保存的数据会直接消失，不建议使用
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable3());
        t.setName("t");
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // 5秒之后终止t线程
        t.stop();// 已过时，不建议使用
    }
}

class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // TODO Auto-generated method stub
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}