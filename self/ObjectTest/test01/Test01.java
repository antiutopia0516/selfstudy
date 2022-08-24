package advance.ObjectTest.test01;
/*
 * 关于Object类中的toString方法
 *  1、源代码长什么样
 *     public String toString() {
       return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    源代码上toString（）的默认实现是：
        类名@对象的内存地址转换成十六进制的形式

    2、SUN公司设计toString（）方法的目的是什么？
    toString（）方法的作用是什么？
        toString（）方法的设计目的是：通过调用这个方法可以将一个“java对象”转换成“字符串表现形式”

    3、SUN公司开发JAVA语言的时候建议所有子类都去重写toString（）方法。toString（）方法应该是个简洁的、详实的、易阅读的
 */
public class Test01 {
    public static void main(String[] args) {
        Mytime t1 = new Mytime(1970, 1, 1);
        //一个日期对象转换成字符串形式的话，我可能更希望看到日期而不是内存地址
        String s1 = t1.toString();
        //Mytime类重写toString（）方法之前
        System.out.println(s1);//Mytime@十六进制 Mytime@7344699f
        //重写之后
        //输出引用的时候，会自动调用该引用的toString方法
        System.out.println(s1);//1970年1月1日
    }
}

class Mytime{
    int year;
    int month;
    int day;
    public Mytime(){

    }
    public Mytime(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

//重写toString方法
//怎么重写呢
//越简洁越好，可读性越强越好
//向简洁的、详实的、易阅读的方向发展
public String toString() {
    return this.year + "年" + this.month + "月" + this.day + "日";
}
}

