package advance.Super.test01;

public class SuperTest06 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.yiDong();
    }
}

class Animal{
    public void move(){
        System.out.println("Animal Move");
    }
}

class Cat extends Animal{
    //对move进行重写
    public void move(){
        System.out.println("Cat Move");
    }

    //单独编写一个子类特有的方法
    public void yiDong(){
        this.move();
        move();
        //super.不仅可以访问属性，也可以访问方法
        super.move();
    }
}