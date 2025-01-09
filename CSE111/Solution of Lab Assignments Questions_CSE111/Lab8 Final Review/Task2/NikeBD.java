package Task2;

public class NikeBD {
    public int brance,jordan,cortez,kobe,sold;
    public static int brance1,jordan1,cortez1,kobe1,sold1;
    public String name;

    public NikeBD(String name) {
        this.name = name;
        brance1++;
    }
    public void restockProducts(String name, int qnt) {
        switch(name) {
            case "Jordan":
            jordan+=qnt;
            jordan1+=qnt;
            break;
            case "Cortez":
            cortez+=qnt;
            cortez1+=qnt;
            break;
            case "Kobe":
            kobe+=qnt;
            kobe1+=qnt;
            break;
            default: System.out.println("Invalid Product name");
        }
    }
    public void restockProducts(String[] name, int[] qnt) {
        for(int i = 0;i<=name.length-1;i++)
        {
            this.restockProducts(name[i],qnt[i]);
        }
    }
    public static void status() {
        System.out.println("Nike Bangladesh Status:");
        System.out.println("Branches Opened: " + brance1);
        System.out.printf("Currently Stocked: Jordan: %d, Cortez: %d, Kobe: %d\n",jordan1,cortez1,kobe1);
        System.out.println("Sold: " + sold1);
    }
    public void details() {
        System.out.printf("Nike %s outlet:\nProcuts Currently Stocked: Jordan: %d,Cortez: %d, Kobe: %d\nSold: %d\n",name,jordan,cortez,kobe,sold);
    }
    public void productSold(String name, int qnt) {
        switch(name) {
            case "Jordan":
                if(jordan-qnt>=0) {
                    jordan-=qnt;
                    sold+=qnt;
                    jordan1-=qnt;
                    sold1+=qnt;
                }
            break;
            case "Cortez":
                if(cortez-qnt>=0) {
                    cortez-=qnt;
                    sold+=qnt;
                    cortez1-=qnt;
                    sold1+=qnt;
                }
                break;
            case "Kobe":
                if(kobe-qnt>=0) {
                    kobe-=qnt;
                    sold+=qnt;
                    kobe1-=qnt;
                    sold1+=qnt;
                }
                break;
        default: System.out.println("Invalid Product Name.");
    }
    }
    public void productSold(String name1,int qnt1,String name2, int qnt2) {
        this.productSold(name1,qnt1);
        this.productSold(name2,qnt2);
    }
}
