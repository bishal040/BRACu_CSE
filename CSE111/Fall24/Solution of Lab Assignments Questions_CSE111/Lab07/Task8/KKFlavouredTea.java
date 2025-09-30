package Task8;

public class KKFlavouredTea extends KKTea{
    public KKFlavouredTea(String name,int price,int quantity) {
        super(name,price,quantity);
    }
    public static void updateSoldStatusFlavoured(KKFlavouredTea t) {
        FlavourSales++;
        totalSales++;
    }
}
