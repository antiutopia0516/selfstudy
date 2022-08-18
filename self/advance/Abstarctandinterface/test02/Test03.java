package advance.Abstarctandinterface.test02;
/*
 * 接口和接口之间支持多继承，那么一个类可以同时实现多个接口吗？
 *  对于计算机来说，一个机箱上有多个接口，一个接口是接键盘的，一个接口是接鼠标的，一个接口是接电源的，一个接口是接显示器的
 * 
 * 一个类可以同时实现多个接口。
 * 
 * 这种机制弥补了Java中的哪个缺陷？
 *  java中类和类只支持单继承。实际上单继承是为了简单而出现的，现实世界中存在多继承。java接口弥补了单继承的缺陷
 */
public class Test03 {
    public static void main(String[] args) {
        //多态该怎么用？
        //都是父类型引用指向子类型对象

        A a = new D();
        B b = new D();
        C c = new D();
    }
}

interface A{
    void m1();
}

interface B{
    void m2();
}

interface C{
    void m3();
}

//实现多个接口，其实就类似于多继承
class D implements A,B,C{

    public void m1(){

    }

    public void m2(){
        
    }

    public void m3(){
        
    }
}

