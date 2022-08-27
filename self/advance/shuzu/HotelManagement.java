package advance.shuzu;

import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        /* 
        //创建酒店对象
        Hotel hotel = new Hotel(3, 10);
        //打印酒店对象
        hotel.print();
        */

        Hotel hotel = new Hotel(5, 20);

        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("请输入对应的功能列表：[1]表示查看房间列表 [2]表示订房 [3]表示退房 [0]表示退出系统");
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("请输入功能编号");
        int i = s.nextInt();
        if(i == 1){
            //查看房间列表
            hotel.print();
        }else if(i == 2){
            //订房
            System.out.print("请输入房间编号：");
            int roomNo = s.nextInt();
            hotel.checkIn(roomNo);
        }else if(i == 3){
            //退房
            System.out.print("请输入房间编号");
            int roomNo = s.nextInt();
            hotel.checkOut(roomNo);
        }else if(i == 0){
            //退出系统
            System.out.println("欢迎下次再来！");
            return;
        }else{
            System.out.println("您输入的号码不对，请重新输入");
        }
        }
        
        
    }
}
