package advance.Abstarctandinterface.test02;
/*
 * 接口的基础语法：
 *  1、类和类之间叫做继承，类和接口之间叫做实现
 *  继承使用extends关键字完成。
 *  实现使用implement关键字完成
 * 
 *  2、当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现（覆盖、重写）
 */
public class Test02 {
    public static void main(String[] args) {
        //错误：MyMath是抽象的；无法实例化
        //new MyMath();

        //能使用多态吗？可以。

        //父类型的引用指向子类型的对象
        MyMath mm = new MyMathImpl();
        //调用接口里的方法（）
        int result = mm.sum(10, 20);
        System.out.println(result);

        int result1 = mm.sub(20, 10);
        System.out.println(result1);
    }
    
}

//定义接口 我的数学接口
//特殊的抽象类，完全抽象，叫做接口
interface MyMath{

    double PI = 3.1415926;

    int sum(int a, int b);
    int sub(int a, int b);
}

//编写一个类（这个类是一个非抽象的类）
//这个类的名字是随意的

class MyMathImpl implements MyMath{
//重写/覆盖/实现 接口中的方法（通常叫做实现）
//接口中所有方法都是public，所以在非抽象类中实现接口中的方法必须加public
    public int sum(int a,int b){
    return a + b;
    }

    public int sub(int a,int b){
    return a - b;
    }
}
