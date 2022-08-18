package basic.constructor;

public class CustomerTest {
    public static void main(String[] args) {

         Customer c1 = new Customer();
         System.out.println(c1.getNo());
         System.out.println(c1.getName());
         System.out.println(c1.getBrith());

         Customer c2 = new Customer(111,"zhangsan","2002-05-16");
         System.out.println(c2.getNo());
         System.out.println(c2.getName());
         System.out.println(c2.getBrith());

    }
    
}
