package advance.ObjectTest.test01;

//String类对象比较的时候必须使用equals方法
public class Test04 {
    public static void main(String[] args)  {
        Student s1 = new Student(111, "宜川");
        Student s2 = new Student(111, "宜川");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
    }
}

class Student{
    //学号
    int no;
    //所在学校
    String school;

    public Student(){}
    public Student(int no, String school){
        this.no = no;
        this.school = school;
    }

    //重写toString方法
    public String toString(){
        return "学号" + no + "学校名" + school;
    }

    //重写equals方法
    //需求：放一个学生的学号相等，并且学校相同时，表示同一个学生
    //equals方法的编写模式都是固定的。架子差不多
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Student)) return false;
        if(this == obj) return true;
        Student s =(Student)obj;
        return this.no == s.no && this.school.equals(s.school);
            
    }
}
