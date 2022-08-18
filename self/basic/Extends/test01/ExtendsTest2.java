package basic.Extends.test01;

public class ExtendsTest2 {
    public static void main(String[] args) {
        C c = new C();
        c.doSome();
        c.doOther();
    }
}

class A{
    public void doSome(){
        System.out.println("do Some!");
    }
}

class B extends A{
    public void doOther(){
        System.out.println("do Other!");
    }
}

class C extends B{

}