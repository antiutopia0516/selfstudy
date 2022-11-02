package advance.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws Exception{
        // 创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true); 守护线程

        // 指定定时任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2022-10-27 03:05:00");
        timer.schedule(new LogTimerTask(), firstTime, 1000 * 10);
    }
}

// 编写一个定时任务类
// 假设这是一个记录日志的定时任务
class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        // 编写需要执行的任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime + "成功完成了一次数据备份");
    }
    
}
