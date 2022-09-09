package advance.exception.homework;

public class UserService {

    /**
     * 
     * @param username 用户名
     * @param password 密码
     * @throws IllegalNameException 当用户名为null，长度大于6或小于14时，会出现该异常
     */
    public void register(String username, String password) throws IllegalNameException{
        /* 
         * 引用 == null的这个判断最好放到所有条件的最前面
         */
        if(username == null || username.length() <= 6 || username.length() >= 14){
            throw new IllegalNameException("用户名不合法，长度必须在【6-14】之间");
        }
        // 程序能执行到这里，说明用户名合法
        System.out.println("注册成功，欢迎[" + username + "]");
    }
}
