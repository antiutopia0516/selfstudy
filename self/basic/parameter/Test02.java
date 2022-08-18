package basic.parameter;

public class Test02 {
    public static void main(String[] args) {
        User u = new User(20);
        add(u);
        System.out.println("main--> " + u.age);//21
    }

    public static void add(User u) {
        u.age++;
        System.out.println("add--> " + u.age);//21
    }
    
}

class User{
    //实例变量
    int age;

    //构造方法
    public User(int i){
        age = i;
    }
}