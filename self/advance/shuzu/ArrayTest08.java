package advance.shuzu;
/*
 * 关于一维数组的扩容
 * 在java开发中，数组长度一旦确定不可变，那么数组满了怎么办？
 *  数组满了，需要扩容
 *  java中对数组的扩容是：
 *      先新建一个大容量的数组，然后将小容量数组中的数据一个一个拷贝到大数组当中。
 * 
 * 结论：数组扩容效率较低。由于涉及到拷贝的问题。所以在以后的开发中请注意：尽可能少的进行数组的拷贝。
 * 可以在创建数组对象的时候预估计以下多长合适，最好预估准确，这样可以减少数组的扩容次数。提高效率
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        //java中的数组是怎么进行拷贝的呢
        //System.arraycopy(src, srcPos, dest, destPos, length);

        //拷贝源（从这个数组拷贝）
        int[] src = {1, 11, 22, 3, 4};

        //拷贝目标（拷贝到这个数组上）
        int[] dest = new int[20];//动态初始化一个长度为20的数组，每个元素的默认值为0

        //调用JDK System中的arraycopy方法，来完成数组的拷贝
        System.arraycopy(src, 0, dest, 0, src.length);
        for(int i = 0; i < dest.length; i++){
            System.out.println(dest[i]);
            if(i >= src.length - 1){
                return;
            }
        }
    }
}
