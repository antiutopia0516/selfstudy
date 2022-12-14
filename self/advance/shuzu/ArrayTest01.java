package advance.shuzu;


/*
 * Array
 *  1、Java语言中的数组是一种引用数据类型。不属于基本数据类型。数组的父类是Object
 *  2、数组实际上是一个容器，可以同时容纳多个元素。（数组是一个数据的集合）
 *      数组：字面意思是“一组数据”
 *  3、数组中可以存储基本数据类型的数据，也可以存储引用数据类型的数据。
 *  4、数组因为是引用类型，所以数组对象是堆内存当中（数组是存储在堆中的）
 *  5、数组当中如果存储的是java对象的话，实际上存储的是对象的“引用”（内存地址）,数组中不能直接存储java对象
 *  6、数组一单创建，在java中规定，长度不可变
 *  7、数组的分类：一维数组、二维数组、三位数组、多维数组。。。（一维数组较多，二维数组偶尔使用！）
 *  8、所有的数组对象都有length属性，用来获取数组中元素的个数
 *  9、java中的数组要求数组中元素的类型统一。
 *  10、数组在内存方面存储的时候，数组中的元素内存地址（存储的每一个元素都是有规则的挨着排列的）是连续的。内存地址连续
 *      这是数组存储元素的特点（特色）。数组实际上是一种简单的数据结构。
 *  11、所有的数组都是拿第一个“小方框”的内存地址作为整个数组对象的内存地址
 *  12、怎么声明/定义一个一维数组
 *      语法格式：
 *          int[] array1;
 *          double[] array2;
 *          boolean[] array3;
 *          String[] array4;
 *          Object[] array5;
 *  13、怎么初始化一个一维数组？
 *      包括两种方式：静态初始化一维数组，动态初始化一维数组
 *      静态初始化语法格式：
 *          int[] array = {100, 2100, 300};
 *      动态初始化语法格式：
 *          int[] array = new int[5];//这里的5表示数组的元素个数。初始化一个5个长度的int类型数组，每个元素默认值为0
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        //使用静态初始化的方式声明一个int类型的数组
        int[] a = {1, 100, 10, 20, 55, 689};

        //数组中每一个元素都有length属性
        System.out.println("数组中元素的个数" + a.length);

        //数组中每个元素都有下标
        //通过下标对数组中的元素进行存取
        //取
        System.out.println("第一个元素" + a[0]);
        System.out.println("最后一个元素" + a[a.length - 1]);

        //存（改）
        //把第一个元素修改为111
        a[0] = 111;
        //把最后一个元素修改为0
        a[a.length - 1] = 0;

        System.out.println("第一个元素" + a[0]);
        System.out.println("最后一个元素" + a[a.length - 1]);

        //一维数组怎么遍历
        for(int i = 0; i < a.length; i++){
            System.out.println("第"+ (i+1) + "个元素的值是" + a[i]);
        }

        System.out.println();
        //下标为6表示第7个元素，第七个元素没有了，下标越界了
        //System.out.println(a[6]); //ArrayIndexOutOfBoundsException(比较著名的异常)

        //从最后一个元素遍历到第一个元素
        for(int i = a.length - 1; i >= 0; i--){
            System.out.println("第"+ (i+1) + "个元素的值是" + a[i]);
        }
        
    }
}
