package advance.io;

public class LogTest {
    public static void main(String[] args) {
        // 测试工具类是否好用
        Logger.log("调用了System类的gc方法，建议启动垃圾回收");
        Logger.log("调用了UserService的doSome方法");
        Logger.log("用户尝试登陆，登录失败");
    }
}
