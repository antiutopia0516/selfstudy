package advance.Abstarctandinterface.test03;

//美国厨师
//实现菜单上的菜
//厨师是接口的实现者
public class AmericanCook implements FoodMenu{
    //西红柿炒蛋
    public void shiZiChaoJiDan(){
        System.out.println("美国厨师做的西红柿炒蛋");
    }

    //鱼香肉丝
    public void yuXiangRouSi(){
        System.out.println("美国厨师做的鱼香肉丝");
    }
}
