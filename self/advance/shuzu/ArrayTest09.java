package advance.shuzu;
/*
 * 关于java中的二维数组
 *  1、二维数组其实是一个特殊的一维数组，特殊在一维数组当中的每一个元素都是一个一维数组
 *  2、三位数组是一个特殊的二维数组
 *      实际开发中使用最多的是一维数组。二维数组也很少使用，三维数组几乎不用。
 *  3、二维数组静态初始化
 *      int[][] array = {{111, 222}, {222, 333}, {3123, 4234}};
 *  
 */
public class ArrayTest09 {
    public static void main(String[] args) {
        //一维数组
        int[] array = {100, 200, 300};

        //二维数组
        //里面的是四个一维数组
        int[][] a = {
                {100, 200, 300},
                {30, 20, 10, 80},
                {6, 6, 3, 2, 1},
                {0}
            };

        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[0]);
        System.out.println(a[0][2]);

        //取出第一个一维数组
        int[] a1 = a[0];
        System.out.println(a1);
        System.out.println(a1[0]);

        //合并以上代码
        System.out.println(a[0][0]);
    }
}
