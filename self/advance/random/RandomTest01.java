package advance.random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        // 创建随机数对象
        Random random = new Random();

        // 随机产生一个int范围内的数字
        int a = random.nextInt();
        System.out.println(a);

        // 产生[0，100]之间的随机数    
        // nextInt翻译为：下一个int类型的数据是101，表示只能取到100
        int b = random.nextInt(101);
        System.out.println(b);
    }
}
