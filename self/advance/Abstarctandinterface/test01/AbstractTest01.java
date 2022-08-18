package advance.Abstarctandinterface.test01;
/*
 * 抽象类：
 *  1、什么是抽象类？
 *      类与类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类
 *      类到对象是实例话，对象到类是抽象
 *      抽象类的特征是一个抽象的概念，无法实例化
 *      类本身是不存在的，所以抽象类无法实例化
 * 
 *  2、抽象类属于什么定义？
 *      抽象类也属于引用数据类型
 * 
 *  3、抽象类怎么定义？
 *      语法：
 *          [修饰符列表] abstarct class 类名{
 *              类体;
 *          }
 * 
 *  4、抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的
 * 
 *  5、final和abstract不能联合使用，这两个关键字是对立的
 * 
 *  6、抽象类的子类可以是抽象类
 * 
 *  7、抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的
 * 
 *  8、抽象类关联到一个概念，抽象方法，什么是抽象方法呢？
 *      抽象方法表示没有实现的方法，没有方法体的方法。例如：
 *          public abstract void doSome();
 *          抽象方法特点是：
 *              1、没有方法体，以分号结尾
 *              2、前面修饰符列表中有abstract关键字。
 * 
 *  9、抽象类中不一定有抽象方法。抽象方法一定在抽象类中
 */
public class AbstractTest01 {
    public static void main(String[] args) {
        //错误：Account是抽象的，无法实例化
        //Account act = new Account();
    }
}

//银行账户类
abstract class Account{
    public Account(String s){

    }

    public Account(){

    }
    //非抽象方法
    public void doSome(){}

    //抽象方法
    public abstract void withdraw();
}

//子类继承抽象类，子类可以实例化对象
class CreditAccount extends Account{
    public void doSome(){}
    public void withdraw(){}
}
