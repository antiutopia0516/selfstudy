package basic.This.test004;
/*
 * “this.”什么时候不能省略？
 *      用来区分局部变量和实例变量的时候，this.不能省略
 */

//用户类
public class User {
    //属性
    private int id;//实例变量
    private String name;
    
    //构造函数
    public User(){

    }

    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    //setter and getter
    /* 
    public void setId(int a){
        //this.id = a;
        id = a;
    }
    */
    /* 
    public void setId(int id){
        //等号前面的this.id是实例变量id
        //等号后面的id是局部变量id
        this.id = id;
    }
    */

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
