public class Passenger {
    public static int no_of_passenger;
    public static double total_fare;
    public String name;
    public double distance;
    private double begWeight;
    public Passenger(String name,double distance){
        this.name = name;
        this.distance = distance;
        no_of_passenger++;
        total_fare = 20 * distance;
    }
    public void storeBaggageWeight(double begWeight){
        this.begWeight = begWeight;
        total_fare += 10 * this.begWeight;
    }
    public void passengerDetails(){
        System.out.printf("Name: %s\nFare: %,.1f TK\n",this.name,total_fare );
    }
}
