package advance.io;

import java.io.Serializable;

public class User implements Serializable{
    int no;
    String name;
    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", no=" + no + "]";
    }
    
}
