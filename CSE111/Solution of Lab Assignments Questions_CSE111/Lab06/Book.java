public class Book{  
 static int total_books_sold;
 static double total_revenue;
 private double price = 150;
 private String title;
 
 public Book(String title,int discount){
   this.title = title;
   calcDiscount(discount);
   total_books_sold++;
   total_revenue+=this.price;
 }

 public void calcDiscount(int discount){
    this.price = this.price-(discount/100.0)*this.price;
 }

 public void bookDetails(){
   System.out.printf("Title: %s\nPrice after Discount: %,.1f TK\n",this.title,this.price);
 }
 
}