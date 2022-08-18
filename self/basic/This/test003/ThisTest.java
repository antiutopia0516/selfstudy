package basic.This.test003;

/*
 * 在带有static的方法中不能”直接“访问实例变量和实例方法
 * 因为实例变量和实例方法都需要对象的存在
 * 而static的方法当中是没有this的。也就是说当前对象是不存在的
 * 自然也是无法访问当前对象的实例变量和实例方法
 */

public class ThisTest {
    //带有static
    //主方法
    public static void main(String[] args) {

        //调用doSome方法
        doSome();
        ThisTest.doSome();

        //调用doOther方法
        ThisTest tt = new ThisTest();
        tt.doOther();

        //调用run方法
        tt.run();
    }
    
    //带有static
    public static void doSome(){

        System.out.println("doSome!");
    }

    //实例方法
    public void doOther(){
        //this表示当前对象
        System.out.println("doOther!");
    }

    //实例方法
    //run是实例方法，调用run方法一定是有对象存在的
    //一定是先创建了一个对象才能调用run
    public void run(){
        //在大括号中的代码执行过程中一定是存在“当前对象”的
        //也就是说这里一定是有“this”的
        System.out.println("run execute!");

        //doOther是一个实例方法，实例方法的调用必须有对象的存在
        //以下代码的含义是：调用当前对象的doOther方法
        doOther();
        //this.doOther();
    }
}
