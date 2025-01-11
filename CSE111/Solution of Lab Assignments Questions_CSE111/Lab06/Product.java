public class Product{
  private String name="Unknown";
  private double price = 0.0;
  private int quantity;
  
  public Product(){
  }
  public Product(String name, double price){
    this.name = name;
    this.price = price;
  }
  public void displayInfo(){
    displayInfo(false);
  }
  public void displayInfo(boolean flag){
  System.out.printf("Product Name: %s\nPrice: $%,.1f",this.name,this.price);
  if(flag)
  {
    System.out.println();
    System.out.printf("Quantity: %d\n", this.quantity);
  }
  }
  
  public void setQuantity(int qnt)
  {
    this.quantity = qnt;
  }
  public double getPrice(){
    return this.price;
  }
  public int getQuantity(){
    return this.quantity;
  }
  }
