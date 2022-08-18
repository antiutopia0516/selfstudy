package basic.bao.test01;

public class Test02 {
    public static void main(String[] args) {

        //完整类名是 bao.test01.Test01
        basic.bao.test01.Test01 t = new basic.bao.test01.Test01();
        System.out.println(t);

        //可以省略包名，因为Test01和Test02在同一个软件包中
        Test01 tt = new Test01();
        System.out.println(tt);
    }
}
