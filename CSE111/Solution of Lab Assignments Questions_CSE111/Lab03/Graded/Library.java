package Graded;
public class Library {
  public int capacity =0;
  public String[] bookList;
  public int count;
  
  public void setBookCapacity(int capacity)
  {
    this.capacity = capacity;
    this.bookList = new String[capacity];
  }
  public void addBook(String name)
  {
    if(count<this.bookList.length)
    {
        bookList[count]=name;
        System.out.println("book '" + bookList[count] + "' added to the library");
        count++;
    }
    else{
        System.out.println("Maximum capacity exceeds. You can't add more than " + this.bookList.length + " books");
    }
  }
     public void printDetail()
    {
     System.out.println("Maximum Capacity: " + capacity );
     System.out.println("Total Books " + this.count);
     System.out.println("Book list: " );
    for(int i = 0; i<this.count;i++)
    {
        System.out.println(bookList[i]);
    }
    }
}
