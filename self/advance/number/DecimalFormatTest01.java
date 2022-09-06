package advance.number;

import java.text.DecimalFormat;

/* 
 * 关于数字的格式化
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {

        //java.text.DecimalFormat 专门负责数字格式化

         /* 
         * 数字格式有哪些
         *  #代表任意数字
         *  ，代表千分位
         *  .代表小数点
         *  0代表不够时补零
         */

        //表示加入千分位，保留两个小数
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.56);
        System.out.println(s);

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 = df2.format(1234.56);
        System.out.println(s2);
    }
}
