package advance.Super.test01;

public class SuperTest04 {
    public static void main(String[] args) {
        Vip vip = new Vip("zhangsan");
        vip.shopping();
    }
}

class Customer{
    String name;

    public Customer(){

    }

    public Customer(String name){
        this.name = name;
    }
}

class Vip extends Customer{
    
    String name;

    public Vip(){

    }

    public Vip(String name){
        super(name);
    }

    public void shopping(){
    
        System.out.println(this.name + "正在购物");
        System.out.println(super.name + "正在购物");
        System.out.println(name + "正在购物");
    }
}