package advance.shuzu;

public class ArrayTest02 {
    public static void main(String[] args) {
        //定义一个数组，采用动态初始化的方式创建
        int[] a = new int[4];//创建长度为4的数组，数组中每个元素的默认值是0
        //遍历数组
        for(int i = 0; i < a.length; i++){
            System.out.println("数组中下标为" + i + "的元素是" + a[i]);
        }

        //初始化一个Object类型的数组，采用动态初始化的方式
        Object[] objs = new Object[3];//三个长度，动态初始化，所以每个元素默认值是null
        for(int i = 0; i < objs.length; i++){
            System.out.println("数组中下标为" + i + "的元素是" + objs[i]);
        }
    }
}
