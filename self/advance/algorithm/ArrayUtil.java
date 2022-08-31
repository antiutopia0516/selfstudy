package advance.algorithm;

/*
 * 数组工具类：自己写的
 * 关于查找算法中的二分法查找。
 *  10 11 12 13 14 15 16 17 18 19 20
 *  通过二分法查找，找出18这个元素的下标
 * 
 * 二分法查找算法是基于排序的基础之上
 */
public class ArrayUtil {
    public static void main(String[] args) {

        int[] arr = {100, 200, 230, 235, 600, 1000, 2000, 9999};

        //找出arr这个数组中200所在的下标
        //调用方法
        int index = binarySearch(arr,200);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标" + index);

        
    }

    private static int binarySearch(int[] arr, int dest) {
        //开始下标
        int begin = 0;
        //结束下标
        int end = arr.length - 1;

        while(begin <= end){
        //中间元素下标
        int mid = (begin + end) / 2;

        if(arr[mid] == dest){
            return mid;
        } else if(arr[mid] < dest){
            begin = mid + 1;
        } else{
            end = mid - 1;
        }
    }
        return -1;
    }

    
}
