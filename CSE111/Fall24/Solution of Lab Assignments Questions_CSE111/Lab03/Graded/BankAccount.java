package Graded;
public class BankAccount{
    public int acc_no=0;
    public String type ="Not Set";

    public String printDetails()
    {
        String str = "Account No: " + acc_no + "\n" + "Type : " + type;
        return str;
    }
    public void setInfo(int acc_no,String type)
    {
        this.acc_no = acc_no;
        this.type = type;
        System.out.println("Account information updated!");
    }
}