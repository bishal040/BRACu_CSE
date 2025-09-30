package Task7;

public class CinemexTicket extends MovieTicket{
    public double price;
    private static int totalTicket,index;
    public String genre,seatType,status="Not Paid";
    public CinemexTicket(String movie,String showTime, String genre, String date) {
        this(movie,showTime,genre,date,"Regular");
    }
    public CinemexTicket(String movie,String showTime, String genre, String date,String seatType) {
        for(String element:seatTypes) {
            if(!element.equals(seatType))
            index++;
            else{
                break;
            }
        }
        super(movie,date,showTime,seatPrices[index]);
        this.genre = genre;
        totalTicket++;
    }
    public static int getTotalTickets() {
        return totalTicket;
    }
    public void calculateTicketPrice() {
       String[] arr =  showtime.split(":");
       if(Integer.parseInt(arr[0])>=18 && Integer.parseInt(arr[0])<=23) {
        setPrice(getPrice()+getPrice()*15/100.0);
        System.out.println("Ticket price is calculated successfully.");
        return;
       }
       setPrice(getPrice());
       System.out.println("Ticket price is calculated successfully.");
    }
    @Override
    public String toString() {
        String str = "\nGenre: "+ genre + "\nSeat Type: " + seatTypes[index] + "\nPrice(tk): " + getPrice() + "\nStatus: " + status;
        return super.toString()+str;
    }
    public String confirmPayment() {
        if(!status.equals("Paid")) {
        status = "Paid";
        return "Payment Successful.";
        }
        return "Ticket price is already paid!";
    }
}
