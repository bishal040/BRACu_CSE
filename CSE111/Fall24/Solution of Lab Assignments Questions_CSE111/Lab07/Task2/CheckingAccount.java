package Task2;

public class CheckingAccount extends Account {
    public static int count;
    private static double balance=0;
    public CheckingAccount() {
        super(balance);
        count++;
    }
    public CheckingAccount(double balance) {
        super(balance);
        count++;
    }
}
