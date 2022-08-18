package basic.This.test001;

public class CustomerTest {
    public static void main(String[] args) {

        //创建Customer对象
        Customer c1 = new Customer();
        c1.name = "zhangsan";

        //c1购物
        c1.shopping();

        //再创建Customer对象
        Customer c2 = new Customer();
        c2.name = "lisi";

        //c2购物
        c2.shopping();

        //调用doSome方法（修饰符列表上有static）
        //采用“类名.”的方式访问，显然这个方法在执行的时候不需要对象的参加

        Customer.doOther();
    }
}
