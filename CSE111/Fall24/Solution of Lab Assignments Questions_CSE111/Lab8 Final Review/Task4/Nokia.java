package Task4;

public class Nokia extends Mobile{
    public int balance;

    public Nokia(String model,boolean status,String imei,int balance) {
        super(model,imei,status);
        this.balance = balance;
    }
    @Override
    public String toString() {
        return String.format("%sBalance: %.1f TK", super.toString(),(double)balance);
    }
    public String dialCall(String num) {
        String region = getCountryName(num.substring(0,3));
        if(region==null){
            return "Dialing is not allowed in this region.";
        }
        if(!simCardStatus) {
            return "No SIM card available! Please check the SIM card connectivity.";
        }
        if(balance!=0) {

            return String.format("Dialing the number %s to %s region",num,region);
        }
        return "Insufficient balance! Please recharge.";
    }
    public void rechargeSIMCard(int balance) {
        this.balance +=balance;
        System.out.printf("Recharge successful! Current balance %.1f TK.\n",(double)this.balance);
    }
    public void activateSimCard() {
        if(!simCardStatus) {
            simCardStatus=true;
            System.out.println("SIM card is activated successfully.");
            return;
        }
        System.out.println("SIM card is already activated.");
    }
}
