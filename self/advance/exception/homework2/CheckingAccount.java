package advance.exception.homework2;

public class CheckingAccount extends Account {

    double overDraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
        //TODO Auto-generated constructor stub
    }

    public CheckingAccount(double balance, double overDraftProtection){
        super(balance);
        this.overDraftProtection = overDraftProtection;
    }

    public double withdraw(double amount) throws OverdraftException{
        if(amount > this.getBalance() + overDraftProtection){
            double deficit = amount - (this.getBalance() + overDraftProtection);
            throw new OverdraftException("透支额度超标",deficit);
        }
    return this.getBalance() - amount;
    }
    
}
