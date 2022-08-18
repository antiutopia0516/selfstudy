package basic.bao.test01;//两个目录

/*
 * 关于java语言的包机制：
 *  1、包又称为package，java中引入package主要是为了方便程序的管理。不同功能的类被分门别类放到不同的软件包中，查找比较方便，管理比较方便，易维护。
 * 
 *  2、怎么定义package？
 *      在java源程序的第一行编写package语句。
 *      package只能编写一个语句
 *      语法结构：
 *          package 包名;
 * 
 *  3、包名的命名规范：
 *      公司的域名倒序 + 项目名 + 模块名 + 功能名;
 *      采用这种方式重名的几率较低。因为公司域名具有全球唯一性
 * 
 *      例如：
 *          org.apache.tomcat.core;//四个目录
 * 
 *  4、包名要求全部小写，包名也是标识符，必须遵守标识符的命名规则
 * 
 *  5、一个包对应一个目录。
 * 
 *  6、使用了package机制之后，应该怎么编译呢？怎么运行呢？
 *      使用了package机制之后，类名不再是Test01了，类名是：Package.Test01.Test01
 * 
 *      编译：javac java源文件路径（在硬盘上生成一个class文件：Test01.class）
 * 
 *      手动方式创建目录，将Test01.class字节码文件放到指定的目录下
 * 
 *      运行：java Package.Test01.Test01 
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("Test01's main method execute!");
    }
}
