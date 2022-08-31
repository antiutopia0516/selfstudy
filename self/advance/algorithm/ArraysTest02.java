package advance.algorithm;

import java.util.Arrays;

/*
 * sun公司已经为程序员写好了一个数组工具类;
 * java.util.Arrays;
 */
public class ArraysTest02 {
    public static void main(String[] args) {
        // java.util.Arrays; 工具类中有哪些方法，我们开发的时候要参考API文档
        int[] arr ={3,5,3,1,5,7,8,9,434,2,132,9};
        //排序
        Arrays.sort(arr);
        //输出
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //二分法查找
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index == -1 ?"该元素不存在" : "该元素下标是" + index);
    }
}
