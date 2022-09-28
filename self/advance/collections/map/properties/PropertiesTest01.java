package advance.collections.map.properties;

import java.util.Properties;
/* 
 * 目前只需要掌握properties属性类对象的相关方法即可
 * Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型
 * Properties被称为属性类对象
 * Properties是线程安全的
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        // 创建一个properties对象
        Properties pro = new Properties();
        // 需要掌握Properties的两个方法，一个存一个取
        pro.setProperty("Username", "root");
        pro.setProperty("Password", "123");

        // 通过key获取value
        String s = pro.getProperty("Username");
        System.out.println(s);
    }
}
