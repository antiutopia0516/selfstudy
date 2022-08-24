package advance.ObjectTest.test01;
/*
 * 关于Object类中的equals方法
 *  1、equals方法的源代码
 *     public boolean equals(Object obj) {
       return (this == obj);
    }
    以上这个方法是Object类的默认实现。
        在Object类中的equals方法当中，默认采用的是“==”判断两个对象是否相等。而”==“判断的是两个java对象的内存地址，我们应该判断
        两个java对象的内容是否相等。所以老祖宗的equals方法不够用，需要重写equals

    2、SUN公司设计equals方法的目的是什么？
    以后编程的过程当中，都要通过equals方法来判断两个对象是否相等。
    equals方法是判断两个对象是否相等

    3、我们需要研究一下Object类提供的这个默认的equals方法够不够用
 */
public class Test02 {
    public static void main(String[] args) {

        //判断两个基本数据类型的数据是否相等直接使用“==”
        int a = 100;
        int b = 100;
        //这个“==”是判断a中保存的100和b中保存的100是否相等
        System.out.println(a == b);//true相等 false不相等

        //判断两个java对象是否相等
        //创建一个日期对象2008/8/8
        Mytime t1 = new Mytime(2008, 8, 8);
        //创建了一个新的对象2008/8/8
        Mytime t2 = new Mytime(2008, 8, 8);
        //这里的“==”判断的是：t1中保存的内存地址和t2中保存的内存地址是否相等
        System.out.println(t1 == t2);//false
        boolean flag = t1.equals(t2);
        System.out.println(flag);
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + month;
        result = prime * result + year;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mytime other = (Mytime) obj;
        if (day != other.day)
            return false;
        if (month != other.month)
            return false;
        if (year != other.year)
            return false;
        return true;
    }

    //重写equals方法
    //怎么重写？复制粘贴。相同的返回值类型、相同的方法名、相同的形式参数列表
    /*public boolean equals(Object obj) {
        //当年月日相同时，表示两个日期相同，两个对象相等
        //获取第一个日期的年月日
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;

        //获取第二个日期的年月日
        if(obj instanceof Mytime){
            Mytime t = (Mytime)obj;
            int year2 = t.year;
            int month2 = t.month;
            int day2 = t.day;

            if(year1 == year2 && month1 == month2 && day1 == day2){
                return true;
            }
        }
        return false;
        
     }
    */

    
}
