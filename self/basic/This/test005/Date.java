package basic.This.test005;
/*
 * 自定义的日期类型
 * 
 * this可以使用在哪里：
 * 可以使用在实例方法中，代表当前对象[this.]
 * 可以使用在构造方法中，通过当前的构造方法调用其他的构造方法[this(实参)]
 * 
 * 重点：this（）只能出现在构造方法中的第一行
 */
public class Date {
    //属性
    private int year;
    private int month;
    private int day;

    //构造函数
    /*
     * 需求：当程序员调用以下无参数的构造方法的时候，默认创建的日期是1970-1-1
     */
    public Date() {
        /* 
        this.year = 1970;
        this.month = 1;
        this.day =  1;
        */

        //以上代码可以通过调用另一个构造方法来完成
        //但前提是不能创建新的对象，以下代码表示创建了一个新的对象
        //new Date(1970,1,1);

        //需要用以下的语法来完成新的调用
        //这种方式不会创建新的java对象，但同时又可以达到其他构造方法
        this(1970, 1, 1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    //setter and getter
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    //对外提供一个方法可以将日期答应输出到控制台
    public void print(){
        System.out.println(year + "年" + month + "月" + day + "日");
    }
    
}
