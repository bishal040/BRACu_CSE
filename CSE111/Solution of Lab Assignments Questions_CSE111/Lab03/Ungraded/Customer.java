package Ungraded;

public class Customer {
    public String cart_name;
    public int count;
    public int total;
    public String[] item = new String[4];
    public int[] price = new int[4];
    public void createCustomer(String name)
    {
        this.cart_name = name;
    }
    public void showCart()
    {
        System.out.println("Customer: " + this.cart_name);
        for(int i=0;i<count;i++)
        {
            System.out.println("Item: " + item[i] + " Price: " + price[i]);
        }
    }
    public void addItem(String item,int price)
    {
        if(count<this.item.length)
        {
            this.item[count]=item;
            this.price[count]=price;
            System.out.println(this.item[count] + " added to cart");
            count++;
        }
        else
        {
            System.out.println("Cart is full");
        }
    }
    public void addItem(String item, int price,String item1, int price1)
    {
        if(count<this.item.length)
        {
            this.item[count]=item;
            this.price[count]=price;
            count++;
            this.item[count]=item1;
            this.price[count]=price1;
            System.out.println(this.item[count-1] +" and " + this.item[count] + " added to cart");
            count++;
        }
        else
        {
            System.out.println("Cart is full");
        }
    }

    public void calculatePrice()
    {
        for(int price:price)
        {
            this.total+=price;
        }
        System.out.println("Total: " + this.total);
    }
}
