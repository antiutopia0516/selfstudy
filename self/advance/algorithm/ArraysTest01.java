package advance.algorithm;

import java.util.Arrays;

/*
 * 使用SUN公司提供的数组工具类：java.util.Arrays;
 */
public class ArraysTest01 {
    public static void main(String[] args) {

        int[] arr = {112, 3, 4, 54, 56, 78, 87};

        //工具类当中的方法大部分都是静态的
        Arrays.sort(arr);

        //遍历输出
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
