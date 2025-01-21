package Graded;
public class TaxiLagbe{
public String taxi_no;
public String route;
public int fare;
public int count;
public String[] passengerlist = new String[4];

public void storeInfo(String taxi_no, String route)
{
    this.taxi_no = taxi_no;
    this.route = route;
}
public void printDetails()
{
    System.out.println("Taxi number : ");
    System.out.println("This taxi can cover " + this.route + " area ");
    System.out.println("Total Passenger : " + count);
    System.out.println("Passenger Lists: ");
    for(int i=0;i<count;i++)
    {
        System.out.print(passengerlist[i] + " ");
    }
    System.out.println("");
    System.out.println("Total collected fare: " + fare + " Taka");
}
public void addPassenger(String name, int fare)
{
    if(count<passengerlist.length)
    {
        passengerlist[count]=name;
        this.fare += fare; 
        System.out.println("Dear " + passengerlist[count] + "! Welcome to TaxiLagbe");
        count++;
    }
    else{
        System.out.println("Taxi Full! No more passengers can be added");
    }
}
public void addPassenger(String name, int fare, String name1, int fare1)
{
    this.addPassenger(name,fare);
    this.addPassenger(name1,fare1);
}
}