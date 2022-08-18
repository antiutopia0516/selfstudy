package basic.bao;
import basic.bao.test01.*;

public class Test03 {
    public static void main(String[] args) {

        //创建Test01对象
        //以下代码编译错误：当省略包名之后，会在当前包下找Test01
        //实际上编译器去找bao.Test01 这个类不存在，编译错误
        //Test01 tt = new Test01;
        //System.out.println(tt);

        //修改以上的错误
        //包名不要省略
        //结论：什么时候前面的包名可以省略？ Test03和Test01在同一个包下的时候不需要加包名
        basic.bao.test01.Test01 tt = new basic.bao.test01.Test01();
        System.out.println(tt);//bao.test01.Test01@7344699f

        Test01 t = new Test01();
        System.out.println(t);//bao.test01.Test01@6b95977

    }
}
/*
 * 最终结论：
 *  什么时候需要使用import？
 *      不是java.lang包下，并且不在同一个包下，需要使用import引用
 */