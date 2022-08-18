package advance.Super.homework;
/*
 * 编写java程序模拟简单的计算器。
 * 定义名为Number的类其中有两个整数型数据成员n1和n2应声明为私有
 * 编写构造方法赋予n1和n2初始值
 * 再为该类定义加减乘除等公有实例方法分别对两个成员变量执行加减乘除运算
 */
public class Calculator {
    public static void main(String[] args) {
        Number num = new Number(10, 2);
        num.addition();
        num.subtraction();
        num.multiplication();
        num.divide();
    }
}

class Number{
    private int n1;
    private int n2;

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public void addition(){
        //int result = n1 + n2;
        int result = this.getN1() + this.getN2();
        System.out.println(result);
    }

    public void subtraction(){
        //int result = n1 - n2;
        int result = this.getN1() - this.getN2();
        System.out.println(result);
    }

    public void multiplication(){
        //int result = n1 * n2;
        int result = this.getN1() * this.getN2();
        System.out.println(result);
    }

    public void divide(){
        if(n2 == 0){
            System.out.println("除数不能为零");
            return;
        }
        //int result = n1 / n2;
        int result = this.getN1() / this.getN2();
        System.out.println(result);
    }
}
