package advance.Super.test01;

/*
 * 在恰当的时间使用super（实际参数列表）
 * 
 * super(实参)到底是干什么的
 *  super(实参)的作用是：初始化当前对象的父类型特征。并不是创建新对象。实际上对象只创建了一个
 * 
 * super关键字代表的是什么
 *  super关键字代表的就是“当前对象”的那部分父类型特征。
 *      
 *      我继承了我父亲的一部分特征：
 *      例如：眼睛、皮肤等
 *      super代表的就是“眼睛、皮肤等”
 *      “眼睛皮肤等“虽然继承了父亲的，但这部分在我身上
 */
public class SuperTest03 {
    public static void main(String[] args) {
        CreditAccount ca1 = new CreditAccount();
        System.out.println(ca1.getActno() + "," + ca1.getBalance() + "," + ca1.getCredit());
        CreditAccount ca2 = new CreditAccount("1", 10, 0.9);
        System.out.println(ca2.getActno() + "," + ca2.getBalance() + "," + ca2.getCredit());
    }
}

//账户类
class Account {
    private String actno;
    private double balance;
    
    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }
    public void setActno(String actno) {
        this.actno = actno;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}

//信用账户类
class CreditAccount extends Account{
    
    private double credit;

    public CreditAccount() {
    }

    public CreditAccount(String actno, double balance, double credit){
        //以上两行代码在恰当的位置，正好可以使用 super(actno, balance)
        //通过子类的构造方法调用父类的构造方法
        super(actno, balance);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }

    
}
