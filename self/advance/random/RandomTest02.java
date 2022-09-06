package advance.random;

import java.util.Arrays;
import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        //创建Random对象
        Random rd = new Random();
        //准备一个长度为5的一维数组
        int[] randomArray = new int[5];
        
        //循环。生成随机数
        int index = 0;
        while(index < randomArray.length){
            //生成随机数
            int num = rd.nextInt(6);
            //判断randomArray中有没有这个num
            //如果没有这个num，就放进去
            if(!contains(randomArray, num)){
                randomArray[index++] = num;
            }
        }
        //遍历以上数组
        for(int i = 0; i < randomArray.length; i++){
            System.out.println(randomArray[i]);
        }
    }

    //单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
    /**
     * 
     * @param arr 数组
     * @param key 元素
     * @return true表示包含，false表示不包含
     */
    public static boolean contains(int[] arr, int key){

        //这个方案有bug(排序出问题了)
        //对数组进行升序
        //Arrays.sort(arr);
        //进行二分法查找
        //二分法查找的结果>=0表示这个元素找到了
        //return Arrays.binarySearch(arr, key) >= 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}
