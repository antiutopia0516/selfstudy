package advance.shuzu;

public class Hotel {

    private Room[][] rooms;

    public Hotel(int a, int b){
        //一共有几层，每层的房间类型是什么，每个房间编号是什么
        rooms = new Room[a][b];
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++){
                if(i == 0){
                    rooms[i][j] = new Room((i+1)*100+j+1, false, "单人间");
                }else if(i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1, false, "标准间");
                }else{
                    rooms[i][j] = new Room((i+1)*100+j+1, false, "豪华间");
                }
                
            }
        }
    }
    //在酒店对象上提供一个打印房间列表的方法
    public void print(){
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++){
                Room room = rooms[i][j];
                System.out.print(room + " ");
            }
            //换行
            System.out.println();
        }
    }
    public void checkIn(int roomNum){
        //通过房间编号演算出下标，获取房间对象
        Room room = rooms[roomNum / 100 - 1][roomNum % 100 - 1];
        if(roomNum / 100 - 1 >= rooms.length || roomNum % 100 - 1 >= rooms[roomNum / 100 - 1].length){
            System.out.println("您所预订的房间不存在");
            return;
        }else if(room.isRoomStatus() == true){
            System.out.println("您所预订的房间已被预订");
            return;
        }
        System.out.println("订房成功！");
        room.setRoomStatus(true);
    }

    public void checkOut(int roomNum){
        Room room = rooms[roomNum / 100 - 1][roomNum % 100 - 1];
        if(roomNum / 100 - 1 >= rooms.length || roomNum % 100 - 1 >= rooms[roomNum / 100 - 1].length){
            System.out.println("您所退房的房间不存在");
            return;
        }else if(room.isRoomStatus() == false){
            System.out.println("您退房的房间是空闲的");
            return;
        }
        System.out.println("退房成功！");
        room.setRoomStatus(false);
    }

}
