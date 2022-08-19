package advance.Abstarctandinterface.test03;

//顾客
public class Customer {
    //顾客手里有一个菜单
    //实例变量，属性
    //面向抽象编程，面向接口编程。降低程序耦合度，提高程序扩展力
    private FoodMenu foodMenu;

    //无参数构造方法
    public Customer() {
    }

    //有参数构造方法
    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //setter and getter
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //提供一个点菜的方法
    public void order(){
        //先拿到菜单
        //调用get方法拿菜单
        //FoodMenu fm = this.getFoodMenu();
        //也可以不调用get方法，因为在本类中私有属性是可以访问的。
        foodMenu.shiZiChaoJiDan();
        foodMenu.yuXiangRouSi();
    }
}
