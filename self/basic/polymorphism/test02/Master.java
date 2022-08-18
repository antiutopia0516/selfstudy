package basic.polymorphism.test02;

/*
 * 主人类
 * public class Master {
    /*
     * 喂养宠物的方法
     * public void feed(Cat c){
        c.eat();
    }
}

*/

//降低程序的耦合度【解耦合】，提高程序的扩展力
public class Master {
    public void feed(Pet pet){//Pet pet是一个父类型的引用
        pet.eat();
    }
}
    