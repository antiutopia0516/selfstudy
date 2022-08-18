package basic.constructor;
public class Customer {
    private int no;
    private String name;
    private String brith;
    
    //无参数构造器
    public Customer() {
    }
    
    //有参数构造器
    public Customer(int a, String b, String c) {
        this.no = a;
        this.name = b;
        this.brith = c;
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrith() {
        return brith;
    }
    public void setBrith(String brith) {
        this.brith = brith;
    }
    
}
