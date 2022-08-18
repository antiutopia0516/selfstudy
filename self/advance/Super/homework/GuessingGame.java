package advance.Super.homework;
/*
 * 猜数字游戏
 * 一个类A有一个实例变量v，从键盘接受一个正整数作为实例变量v的初始值
 * 另外在定义一个类B，对A类的实例变量v进行猜测。
 *  如果大了则提示dale
 *  小了则提示小了
 *  等于则提示猜测成功
 */
public class GuessingGame {
    public static void main(String[] args) {
        //创建A对象
        A a = new A(100);
        //创建B对象
        B b = new B(a);
        //开始猜测
        java.util.Scanner s = new java.util.Scanner(System.in);
        while(true){
        System.out.print("请输入猜测的数字");
        int caiNum = s.nextInt();
        b.cai(caiNum);
        }
    }
}

class A{
    private int v;

    public A() {
    }

    public A(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
    
}

class B{

    //把A作为B的实例变量
    //通过B猜测A
    //在B对象中有对A对象的引用
    private A a;

    public B() {
    }

    public B(A a) {
        this.a = a;
    }

    //猜测的方法
    public void cai(int caiNum){
        //实际数字
        //int shiJiZhi = this.getA().getV();
        int shiJiZhi = a.getV();

        if(caiNum == shiJiZhi){
            System.out.println("猜测成功");
            //终止程序执行
            System.exit(0);//退出JVM

        }else if(caiNum < shiJiZhi){
            System.out.println("猜小了");
        }else{
            System.out.println("猜大了");
        }
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}