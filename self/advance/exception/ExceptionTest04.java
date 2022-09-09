package advance.exception;

public class ExceptionTest04 {

    /* public static void main(String[] args) throws ClassNotFoundException{

        //第一种处理方式：在方法声明的位置上继续使用：throws，来完成异常的继续上抛。抛给调用者
        doSome();//Unhandled exception type ClassNotFoundException
    } */

    // 第二种处理方法：try catch进行捕捉
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
