package Graded;
public class Cart{
    public int cart_no;
    public String[] item;
    public double[] price;
    public int count;
    public double totalprice;
    public double discount;
    public void create_cart(int cart_no)
    {
        this.cart_no=cart_no;
        this.item = new String[3];
        this.price = new double[3];
    }
    public void addItem(String item,double price)
    {
        if(count<this.item.length){
        this.item[count]=item;
        this.price[count]=price;
        totalprice +=this.price[count];
        System.out.println(item + " added to cart " + this.cart_no);
        System.out.println("You have " + (int)(count+1) + "item(s) in your cart now.");
        count++;
        }
    }
    public void addItem(double price,String item)
    {
        this.addItem(item,price);
    }
    public void cartDetails()
    {
        System.out.println("Your cart (c" + cart_no + ") :");
        for(int i=0;i<count;i++)
        {
            System.out.println(item[i] + " - " +price[i]);
        }
        System.out.println("Discount Applied: " + this.discount + "%");
        System.out.println("Total price: " + totalprice);
    }
    public void giveDiscount(int discount)
    {
        this.discount=discount;
        this.totalprice = this.totalprice-this.totalprice*(this.discount/100);
    }
}