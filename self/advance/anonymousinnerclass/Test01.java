package advance.anonymousinnerclass;
/*
 * 匿名内部类：
 *  1、什么是内部类？
 *      内部类：在类的内部，又定义了一个新的类。被称为内部类
 *  2、内部类的分类：
 *      静态内部类：类似于静态变量
 *      实例内部类：类似于实例变量
 *      局部内部类：类似于局部变量
 *  3、使用内部类编写的代码，可读性很差。能不用尽量不用
 */
class Test01 {
    public static void main(String[] args) {
        //调用MyMath中的mySum方法
        MyMath mm = new MyMath();

       //mm.mySum(new ComputeImp1(), 100, 200);

       //使用匿名内部类，表示这个ComputeImpl这个类没名字了。
       //这里表面上看上去好像是接口可以直接new了，实际上并不是接口可以new了
       //后面的{}代表了对接口的实现
       mm.mySum(new Compute(){
        public int sum(int a, int b){
            return a + b;
        }
       }, 100, 200);
    }
    
    //该类在类的内部，所以被称为内部类
    //由于前面有static，所以称为静态内部类
    static class Inner1{

    }

    //该类在类的内部，所以被称为内部类
    //没有static，所以称为实例内部类
    class Inner2{

    }

    public void doSome(){
        //该类在类的内部，所以被称为内部类
        //局部内部类
        class Inner3{

        }
    }
}

//负责计算的接口
interface Compute{

    //抽象方法
    int sum(int a, int b);
}

//你自动会在这里编写一个Compute接口的实现类
/* 
class ComputeImp1 implements Compute{
    //对方法的实现
    public int sum(int a, int b){
        return a + b;
    }
}
*/

class MyMath{
    //数学求和方法
    public void mySum(Compute c, int x, int y){
        int retValue = c.sum(x, y);
        System.out.println(x + "+" + y + "=" + retValue);
    }
}