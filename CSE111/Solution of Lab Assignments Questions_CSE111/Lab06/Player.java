public class Player {
    public static int total;
    private static String[] player_list = new String[11];
    private String name,country;
    private int jersey_number;
    public Player(String name, String country , int jersey_number) {
        if(total>=11)
        return;
        this.name = name;
        player_list[total++]= name;
        this.country = country;
        this.jersey_number = jersey_number;
    }
    public String player_detail() {
        String str ="Player Name: "+ name +"\nJersey Number: "+ jersey_number +"\nCountry: " + country;
        return str;
    }
    public static void info() {
        System.out.printf("Total number of players: %d\nPlayers enlisted so far: ",total);
        int count=0;
        for(String element: player_list) {
            if(count!=total) {
                if(player_list[count+1]!=null && count++<total)
                System.out.print(element + " , ");
                else {
                count++;
                System.out.println(element);
                }
            }
        }
    }
}
