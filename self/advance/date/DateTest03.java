package advance.date;

import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //1970/01/01 00:00:00 001
        Date time = new Date(1);//参数是一毫秒


        // 获取昨天此时的时间
        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        System.out.println(time2);
    }
}
