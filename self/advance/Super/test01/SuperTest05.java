package advance.Super.test01;
/*
 * 通过这个测试得出的结论：
 *  super不是引用。super不保存内存地址，super也不指向任何对象
 *  super只是代表当前对象内部的那一块父类型的特征
 */
public class SuperTest05 {
    public static void main(String[] args) {
        SuperTest05 st = new SuperTest05();
        st.doSome();//advance.Super.test01.SuperTest05@251a69d7
        //输出引用的时候，会自动调用引用的toString()方法
        //System.out.println(this.toString());

        //编译错误，需要'.'
        //System.out.println(super);
    }

    public void doSome(){
        System.out.println(this);
    }

    //this和super不能使用在static静态方法中
    /* 
    public static void doOther(){
        System.out.println(this);
        System.out.println(super.);
    }
    */
}




