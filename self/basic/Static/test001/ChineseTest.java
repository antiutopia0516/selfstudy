package basic.Static.test001;

public class ChineseTest {
    public static void main(String[] args) {

        //创建中国人对象1
        Chinese zhangsan = new Chinese("1", "张三");
        System.out.println(zhangsan.id + "," + zhangsan.name + "," + Chinese.country);

        //创建中国人对象2
        Chinese lisi = new Chinese("2", "李四");
        System.out.println(lisi.id + "," + lisi.name + "," + Chinese.country);

        //创建中国人对象3
        Chinese wangwu = new Chinese("3", "王五");
        System.out.println(wangwu.id + "," + wangwu.name + "," + Chinese.country);

        System.out.println(Chinese.country);
        System.out.println(zhangsan.country);
        zhangsan = null;
        System.out.println(zhangsan.country);
    }
    
}
