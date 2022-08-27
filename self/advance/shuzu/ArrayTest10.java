package advance.shuzu;
/*
 * 二维数组的遍历
 */
public class ArrayTest10 {
    public static void main(String[] args) {
        String array[][] = {
            {"java", "oracle", "c++"},
            {"zhangsan", "lisi", "wangwu"},
            {"jack", "lucy", "rose"},
        };

        //遍历二维数组
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
