package advance.algorithm;
/*
 *选择排序：
 * 每一次从这堆参与比较的数据当中找出最小值
 * 拿着这个最小值和前面的元素交换位置
 * 
 * 选择排序比冒泡排序好在：每一次的交换都是有意义的
 * 
 * 关键：选择排序中的关键在于，怎么找出一堆数据中最小的
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 2, 5};

        //选择排序
        //五条数据外层循环四次
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
