package advance.Abstarctandinterface.test03;

public class Test {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu cook1 = new AmericanCook();
        //创建顾客对象
        Customer c = new Customer(cook1);
        //顾客点菜
        c.order();
    }
}
