package advance.thread;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ThreadTest04 {
    public static void main(String[] args) {
        // 创建线程对象，采用匿名内部类方式
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i = 0; i < 100; i++) {
                    System.out.println("分" + i);
                }
            }
            
        });

        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主" + i);
        }
    }
}
