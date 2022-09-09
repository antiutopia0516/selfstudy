package advance.exception;

public class ExceptionTest03 {
    public static void main(String[] args) {
        // main方法中调用doSome方法
        // 因为doSome方法声明位置上有throws ClassNotFoundException
        // 我们在调用doSome方法的时候必须对这种异常进行预先的处理。
        // 如果不处理，编译器就报错
        //doSome();//Unhandled exception type ClassNotFoundException
    }
    /**
     * doSome方法在方法声明的位置上使用了：throws ClassNotFoundException
     * 这个代码表示doSome方法在执行过程中，有可能会出现ClassNotFoundException异常
     * 叫做类没找到异常
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("do Some");
    }
}
