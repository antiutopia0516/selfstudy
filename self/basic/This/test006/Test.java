package basic.This.test006;

public class Test {

    //带有static的方法
    public static void method1(){
        //调用doSome
        //完整方式调用
        Test.doSome();
        //省略方式调用
        doSome();

        //调用doOther
        //完整方式调用
        Test tt = new Test();
        tt.doOther();
        //省略方式调用

        //访问i
        //完整方式调用
        System.out.println(tt.i);
        //省略方式调用
    }
    //没有static的方法
    public void method2(){
        //调用doSome
        //完整方式调用
        Test.doSome();
        //省略方式调用
        doSome();

        //调用doOther
        //完整方式调用
        this.doOther();
        //省略方式调用
        doOther();

        //访问i
        //完整方式调用
        System.out.println(this.i);
        //省略方式调用
        System.out.println(i);
    }

    //主方法
    public static void main(String[] args) {
        //要求在这里编写程序调用method1
        //使用完整方式调用
        Test.method1();
        //使用省略方式调用
        method1();
        //要求在这里编写程序调用method2
        //使用完整方式调用
        Test tt = new Test();
        tt.method2();
        //使用省略方式调用
    }

    //没有static的变量
    int i = 10;

    //带有static的方法
    public static void doSome(){
        System.out.println("do some!");
    }

    //没有static的方法
    public void doOther(){
        System.out.println("do other!");
    }
}
