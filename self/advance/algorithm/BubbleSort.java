package advance.algorithm;

/*
 * 冒泡排序算法
 *  原始数据：3， 2， 7， 6， 8
 *  拿着3和右边相邻的2进行比较，如果左边大于右边，交换位置
 *  交换位置之后的数据：2， 3， 7， 6， 8
 * 
 *  继续拿着上一次比较之后的结果中右边较大的数据和后续的数据进行比较
 * 
 *  核心：
 *      拿着左边的数字和右边的数字比对，当左边大于右边的时候交换位置
 */
public class BubbleSort {
    public static void main(String[] args) {
        
        //int类型的数组对象
        int[] arr = {3, 2, 7, 6, 8};

        //冒泡算法
        //七条数据循环六次
        /* 
        for(int i = 0; i < arr.length - 1; i++){
        }
        */

        int count = 0;
        //七条数据循环六次（冒泡排序的外层循环采用这种方式）
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                count++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("比较的次数" + count);
    }
}
