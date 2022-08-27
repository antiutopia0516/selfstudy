package advance.shuzu;

/*
 * 动态初始化二维数组
 */

public class ArrayTest11 {
    public static void main(String[] args) {

        //三行四列
        int[][] array = new int[3][4];

        /* 
        //二维数组遍历
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        */

        int[][] a ={
            {1, 3, 6, 3},
            {22, 444, 234, 653},
            {234, 423, 123, 54},
        };

        printArray(a);
        printArray(new int[][] {
            {1, 3, 6, 3},
            {22, 444, 234, 653},
            {234, 423, 123, 54},
        });
    }


    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
