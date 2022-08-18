package advance.Abstarctandinterface.test02;
/*
 * 继承和实现都存在的话，代码应该怎么写
 *  extends关键字在前
 *  implement关键字在后
 */
public class Test04 {
    public static void main(String[] args) {
        //创建对象（）
        Flyable f = new Cat();
        f.fly();

        Flyable p = new Pig();
        p.fly();
    }
}

//动物类：父类
class Animal{

}

//可飞翔的接口
//能插拔的就是接口
//接口通常提取的是行为动作
interface Flyable{
    void fly();
}

//动物类子类：猫类
//Flyable是一个接口，是一对翅膀的接口，通过接口插到猫身上，让猫变得可以飞翔。
class Cat extends Animal implements Flyable{
    public void fly(){
        System.out.println("猫起飞");
    }
}

//蛇类，如果你不想让它飞，可以不实现Flyable接口
//没有实现这个接口表示你没有翅膀，没有给你插翅膀，你肯定不能飞
class Snake extends Animal{

}

//想飞就插翅膀这个接口
class Pig extends Animal implements Flyable{
    public void fly(){
        System.out.println("猪起飞");
    }
}