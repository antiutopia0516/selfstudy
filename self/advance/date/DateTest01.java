package advance.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws Exception {

        //capture system time(measured to nearest millisecond)
        Date nowTime = new Date();
        //java.util.Date toString() method has been overrode
        System.out.println(nowTime);//Mon Sep 05 12:48:47 CDT 2022

        //format Date
        //SimpleDateFormat under java.text
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(nowTime));

        //Assume a date String. Convert it into Date.
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date datetime = sdf2.parse(time);
        System.out.println(datetime);

    }
}
