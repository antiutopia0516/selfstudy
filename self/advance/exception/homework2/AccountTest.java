package advance.exception.homework2;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        acc.deposit(200);
        try {
            acc.withdraw(5000);
        } catch (OverdraftException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        CheckingAccount check = new CheckingAccount(1000, 200);
        check.deposit(200);
        try {
            check.withdraw(2000);
        } catch (OverdraftException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
