package advance.thread;
/* 
 * 怎么合理的终止一个线程的执行
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        // 模拟五秒
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        // 终止线程
        r.run = false;
    }
}

class MyRunnable4 implements Runnable{

    // 打一个布尔标记
    boolean run = true;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            if(run){

                System.out.println(Thread.currentThread().getName() + "---->" + i);
            
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }else{
                // 终止当前线程
                return;
            }
            
        }
    }
}
