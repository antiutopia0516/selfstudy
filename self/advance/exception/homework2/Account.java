package advance.exception.homework2;

public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        System.out.println("存款成功，您的余额为" + (this.balance + amount));
        return this.balance += amount;
        
    }

    public double withdraw(double amount) throws OverdraftException{
        if(this.balance < amount){
            throw new OverdraftException("余额不足", amount - this.balance);
        }
        return this.balance -= amount;
    }
}
