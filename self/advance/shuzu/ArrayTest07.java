package advance.shuzu;
/*
 * 一维数组的深入，数据中存储的类型为：引用数据类型
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        //创建一个Animal类型的数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1, a2};

        //对Animal数组进行遍历
        for(int i = 0; i < animals.length; i++){
            /*Animal a = animals[i];
            a.move();*/
            animals[i].move();
        }

        //动态初始化一个长度为2的Animal类型数组
        Animal[] ans = new Animal[2];
        //创建一个Animal对象，放到数组的第一个盒子中
        ans[0] = new Animal();

        //Animals数组中可以存放Cat类型的数据，因为Cat是一个Animal
        ans[1] = new Cat();

        for(int i = 0; i < ans.length; i++){
            /*Animal a = animals[i];
            a.move();*/
            ans[i].move();
        }

        //创建一个Animal类型的数组，数组中存储Cat和Bird
        Animal[] anis = new Animal[]{new Bird(), new Cat()};

        for(int i = 0; i < anis.length; i++){
            /*Animal a = animals[i];
            a.move();*/
            anis[i].move();
        }


    }
}

class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("鸟在飞");
    }
}
