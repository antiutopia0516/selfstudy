package advance.integer;
/* 
 * int Integer String互相转换
 */
public class IntegerTest08 {
    public static void main(String[] args) {

        //Convert int to String
        int a = 100;
        //add "" 
        String s = a + "";
        //use String.valueOf
        String.valueOf(a);

        //Convert String to int
        String str = "123";
        Integer.parseInt(str);


        //Convert String to Integer
        String str2 = "123";
        Integer.valueOf(str2);

        //Convert Integer to String
        Integer x = 100;
        String.valueOf(x);
    }
}
