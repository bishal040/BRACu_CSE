package Ungraded;

public class MoneyTracker {
    public String name ;
    public double balance ;
    public double added;
    public double expense;
    public void createTracker(String name)
    {
        this.name = name;
        this.balance = 1;
    }
    
    public String info()
    {
        String str = "Name: " + this.name +"\n"+ "Current Balance: " + this.balance;
        return str;
    }
    public void income(int balance)
    {
        added = balance;
        this.balance += balance;
        System.out.println("Balance Updated.");
    }
    public void expense(int expense)
    {
        if(balance-expense==0)
        {
            System.out.println("You're broke!");
        }
        else if(balance<expense)
        {
            System.out.println("Not enough balance.");
        }
        else
        {
            balance = balance - expense;
            this.expense=expense;
            System.out.println("Balance Updated.");
        }
    }
    public void showHistory()
    {
        System.out.println("Last added: " + this.added);
        System.out.println("Last spent: " + this.expense);
    }
    
}
