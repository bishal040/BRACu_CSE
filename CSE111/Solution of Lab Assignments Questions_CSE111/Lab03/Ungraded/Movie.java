package Ungraded;
public class Movie
{
    public String title;
    public String director;
    public double rating;
    int count = 0;
    public String[] actor = new String[0];

  


    public void setMovieDetails(String title,String director,double rating)
    {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }
    public void setMovieDetails(String title, String director)
    {
        this.setMovieDetails(title,director,this.rating);
    }
    public void updateRating(double rating)
    {
        this.rating = rating;
        System.out.println("Updated rating of " + this.title + "to " + this.rating);
    }
    public void showInfo()
    {
        System.out.println("Title: " + this.title);
        System.out.println("Director: " + this.director);
        System.out.println("Rating: " + this.rating);
        System.out.print("Actors : ");
        for(int i=0;i<count;i++)
        {
            System.out.print(this.actor[i]);
            if(i<count-1)
            {System.out.print(",");}
        }
        System.out.println("");
    }
    public void addActors(String actor)
    {
        this.createNewArray(actor);
        count++;
        System.out.println("Added actor \"" + actor + "\" to " + this.title );
    }
    public void addActors(String actor1,String actor2)
    {
        this.addActors(actor1);
        this.addActors(actor2);
    }
    public void addActors(String actor1,String actor2,String actor3)
    {
        this.addActors(actor1);
        this.addActors(actor2);
        this.addActors(actor3);
    }
    // public void createNewArray(String actor)
    // {
    //     String[] actorcopy = new String[count+1];
    //     int index=0;

    //     for(String element:this.actor)
    //     {
    //         actorcopy[index++]=element;
    //     }
    //     actorcopy[actorcopy.length-1]=actor;
    //     this.actor = actorcopy;
    // }
    public void createNewArray(String actor1)
    {
        String[] newArray = new String[count+1];
        int index=0;
        for(String element: this.actor)
        {
            newArray[index++]=element;
        }
        newArray[this.actor.length-1]=actor1;
        this.actor = newArray;
    }
    
}