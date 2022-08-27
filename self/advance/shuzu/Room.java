package advance.shuzu;

public class Room {

    //initiated variables
    private int roomNum;
    private boolean roomStatus;
    private String roomType;

    //get set method
    public int getRoomNum() {
        return roomNum;
    }
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
    public boolean isRoomStatus() {
        return roomStatus;
    }
    public void setRoomStatus(boolean roomStatus) {
     this.roomStatus = roomStatus;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
 
    //consrtuctor
    public Room() {
    }
    public Room(int roomNum, boolean roomStatus, String roomType) {
        this.roomNum = roomNum;
        this.roomStatus = roomStatus;
        this.roomType = roomType;
    }

    //@Override equals
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Room)) return false;
        if(this == obj) return true;
        Room room = (Room)obj;
        if(this.roomNum == room.getRoomNum()) return true;
        return false;
    }

    //@Override toString
    public String toString(){
        return "[" + roomNum + "," + roomType + "," + (roomStatus ? "占用" : "空闲") + "]";
    }
    
}
