package advance.Super.test01;

/*
 * 在java语言中不管是new什么对象，最后老祖宗的Object类的无参数构造方法一定会执行（Object类中的无参数构造方法是处于栈顶）
 * 
 * 栈顶的特点：
 *  最后调用，但是最先执行结束。
 *  后进先出原则
 */

public class SuperTest02 {
    public static void main(String[] args) {
        new C();
    }
}

class A{
    public A(){
        System.out.println("1");
    }
}

class B extends A{
    public B(){
        System.out.println("2");
    }

    public B(String name){
        System.out.println("3");
    }
}

class C extends B{
    public C(){
        this("zhangsan");
        System.out.println("4");
    }

    public C(String name){
        this(name, 12);
        System.out.println("5");
    }

    public C(String name, int age){
        super(name);
        System.out.println("6");
    }
}