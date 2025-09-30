package Graded;
public class Shelf{
    public int capacity=0;
    public int totalbook;
    public void showDetails()
    {
        System.out.println("Shelf capacity: " + this.capacity + "\n" + "Number of books: " + this.totalbook);

    }
    public void addBooks(int totalbook)
    {
        if(this.capacity==0)
        {
            System.out.println("Zero capacity. Cannot add books.");
        }
        else if(this.totalbook+totalbook<capacity)
        {
            this.totalbook+=totalbook;
            System.out.println(totalbook + " books added to shelf");
        }
        else if(this.totalbook+totalbook>capacity)
        {
            System.out.println("Exceeds capacity");
        }
    }

}