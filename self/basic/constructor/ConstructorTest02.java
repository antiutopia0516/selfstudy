package basic.constructor;
/*
 * 构造方法的作用：
 * 1、创建对象
 * 2、创建对象的同时，初始化实例变量的内存空间（给实例变量赋值）
 * 
 * 成员变量之实例变量，属于对象级别的变量，这种变量必须先有对象才能有实例变量
 * 实例变量没有手动赋值的时候，系统默认赋值，那么这个系统默认赋值是在什么时候完成的呢？？
 *      是在类加载的时候吗？
 *          不是，因为类加载的时候只加载了代码片段，还没来得及创建对象，所以此时实例变量并没有初始化。
 *      实际上，实例变量的内存空间是在构造方法执行过程中完成开辟的。完成初始化的。
 *      系统在默认赋值的时候，也是在构造方法执行过程中完成的赋值
 */
public class ConstructorTest02 {
    public static void main(String[] args) {
    //查看访问的是哪个属性，查看访问是哪个方法
    //command+鼠标移动到想查看的位置

    //创建对象
    Account act1 = new Account();

    System.out.println("账号：" + act1.getActno());
    System.out.println("余额：" + act1.getBalance());

    Account act2 = new Account("账号");

    System.out.println("账号：" + act2.getActno());
    System.out.println("余额：" + act2.getBalance());

    Account act3 = new Account(500);

    System.out.println("账号：" + act3.getActno());
    System.out.println("余额：" + act3.getBalance());

    Account act4 = new Account("账号", 500);

    System.out.println("账号：" + act4.getActno());
    System.out.println("余额：" + act4.getBalance());
    }
    
}
