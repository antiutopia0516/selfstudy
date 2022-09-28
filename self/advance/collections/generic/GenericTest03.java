package advance.collections.generic;
/* 
 * 可以自定义泛型吗？可以
 *  自定义泛型的时候,<>中的是一个标识符，随便写。
 *  java源代码中经常出现的是：
 *      <E>和<T>
 *  E是element
 *  T是type
 */
public class GenericTest03<sahduashduascuahcuah>{
    
    public void doSome(sahduashduascuahcuah o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();

        gt.doSome("o");

        GenericTest03<Integer> gt2 = new GenericTest03<>();
        gt2.doSome(1);
    }
}
