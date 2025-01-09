package Task8;

public class KKTea extends Tea{
    public int quantity,weight;
    public static int totalSales,regularSales,FlavourSales;
    public KKTea(int price, int quantity) {
        this("Regular", price, quantity);
    }
    public KKTea(String name , int price, int quantity) {
        super("KK " + name + " Tea", price);
        this.quantity = quantity;
        this.weight = 2*quantity;
    }
    @Override
    public void productDetail() {
        super.productDetail();
        System.out.println("Weight: " + weight + ", Tea Bags: " + quantity);
    }
    public static void totalSales() {
        System.out.println("Total Sales: " + totalSales);
        System.out.println("KK Regular Tea: " + regularSales);
        if(FlavourSales!=0)
        System.out.println("KK Flavoured Tea: " + FlavourSales );
    }
    public static void  updateSoldStatusRegular(KKTea t) {
        t.status = true;
        totalSales++;
        regularSales++;
    }
}
