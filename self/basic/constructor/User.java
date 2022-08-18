package basic.constructor;
public class User {
    // 无参数的构造方法
    public User(){
        System.out.println("User123123");
    }
    
    //有参数的构造方法
    public User(int i){
        System.out.println("带有int类型参数的构造器");
    } 

    // 有参数的构造方法
    public User(String name){
        System.out.println("带有string类型的构造方法");
    }

    // 有参数的构造方法
    public User(int i,String name){
        System.out.println("带有int string类型的构造方法");
    }
}
