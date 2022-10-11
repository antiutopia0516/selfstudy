package advance.io;

import java.io.Serializable;

public class Student implements Serializable{
    int no;
    String name;
    
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", no=" + no + "]";
    }
    

}
