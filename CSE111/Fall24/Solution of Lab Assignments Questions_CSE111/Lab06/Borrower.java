public class Borrower{
 public static int book_count[] = {3, 3, 3};
 public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
 private String name;
 public String[] borrowedBook;
 public static void bookStatus(){
   System.out.println("Available Books:");
   for(int i = 0;i<=book_count.length-1;i++)
   {
     System.out.println(book_name[i] +": "+ book_count[i]);
   }
 }
 public Borrower(String name){
 this.name = name;
 }
 public void borrowBook(String name){
   int index=0;
   for(int i = 0;i<=book_count.length-1;i++)
   {
     if(book_name[i].equals(name))
       break;
     index++;
   }
   if(book_count[index]!=0)
   {
    if(borrowedBook==null)
    {
      borrowedBook = new String[1];
      borrowedBook[0] = book_name[index];
    }
    else{
      int count = 0;
      String[] temp = new String[borrowedBook.length+1];
      for(String element: borrowedBook) {
        temp[count++]=element;
      }
      temp[borrowedBook.length]=book_name[index];
      borrowedBook = temp;
    }
    book_count[index]--;
     return;
   }
   System.out.println("This book is not available.");
 }
 public void borrowerDetails(){
   System.out.println("Name: " + this.name+"\nBooks Borrowed:");
    for(String element: borrowedBook) {
      System.out.println(element);
    }
  }
  public static String remainingBooks(String name)
  {
    int count = 0;
    for(String element: book_name)
    {
      if(!element.equalsIgnoreCase(name)) {
        count++;
      }
      else{
        break;
      }
    }
    String str = book_count[count] + " copies of " + name + " is remaining"; 
    return str;
  }
}