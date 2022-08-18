package advance.Super.homework;
/*
 * 请定义一个交通工具（Vehicle）的类
 *  其中有属性：
 *  速度
 *  体积
 *  方法移动
 *  设置速度
 *  加速
 *  减速
 * 
 *  最后在测试类VehicleSpeed中的main方法中实例出一个交通工具对象
 *  并通过方法给它初始化speed，size的值打印出来
 *  另外通过调用加速减速的方法对速度进行改变
 */
public class VehicleSpeed {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(100,20);
        System.out.println("这辆车的速度是" + car.getSpeed() + "这辆车的大小是" + car.getSize());
        car.speedUp(20);
        System.out.println("这辆车的速度是" + car.getSpeed());
        car.speedDown(40);
        System.out.println("这辆车的速度是" + car.getSpeed());
        car.move();
    }
}

class Vehicle{

    private int speed;
    private int size;

    
    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println("gogogo");
    }

    public void speedUp(int speed){
        //this.speed += speed;
        this.setSpeed(this.getSpeed() + speed);
    }

    public void speedDown(int speed){
        //this.speed -= speed;
        this.setSpeed(this.getSpeed() - speed);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}