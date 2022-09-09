package advance.exception.homework;

public class RegistrationTest {
    public static void main(String[] args) {
        //创建UserService对象
        UserService userService = new UserService();
        try {
            userService.register("jackson", "12312");
        } catch (IllegalNameException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }
}
