package Graded;
public class Reader {
    public String name ="New user";
    public int capacity;
    public String[] bookList;
    int count;

    public String createReader(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
        this.bookList = new String[this.capacity];
        return "A new reader is created!";
    }
    public void readerInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Books: " );
        if(count==0)
        {
            System.out.println("No books added yet");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                System.out.println("Book "+ (int)(i+1) +":"+ bookList[i]);
            }
        }
    }
    public void addBook(String book)
    {
        if(count<bookList.length)
        {
            bookList[count]=book;
            count++;
        }
        else
        {
            System.out.println("No more capacity");
        }
    }
}
