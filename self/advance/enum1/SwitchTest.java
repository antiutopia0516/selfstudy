package advance.enum1;

public class SwitchTest {
    public static void main(String[] args) {
        switch(Season.FALL){
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            case FALL:
                System.out.println("fall");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }
    }
}
