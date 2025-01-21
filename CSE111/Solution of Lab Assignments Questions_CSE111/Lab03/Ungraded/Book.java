package Ungraded;

public class Book {
    public String author ="Unknown";
    public String genre ;
    public int pages;
    public String title;
    
    public void createBook(String title,String author, String genre, int pages)
    {
        this.author = author;
        this.genre = genre;
        this.title = title;
        this.pages = pages;
    }
    public void createBook(String title, String author , String genre)
    {
        this.createBook(title,author,genre,this.pages);
    }
    public void createBook(String title)
    {
        this.createBook(title,this.author,this.genre,this.pages);
    }
    public void createBook(String title,String author)
    {
        this.createBook(title,author,this.genre,this.pages);
    }
    public void customizeGenre(String genre)
    {
        this.genre = genre;
        System.out.println("Upated genre of " + this.title + " to  " + this.genre);
    }
    public void customizePages(int pages)
    {
        this.pages = pages;
        System.out.println("Updated pages of " + this.title + " to " + this.pages + " pages." );
    }
    public void displayDetails()
    {
        System.out.println("Title: " + this.title + " , Author: " + this.author + " , Genre: " + this.genre +  " , Pages: " + this.pages);
    }
}
