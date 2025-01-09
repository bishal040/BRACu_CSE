package Task6;

public class Bondhus extends SocialMedia{
    public int index;
    String[] messages = new String[5];
    public Bondhus(String name,String email) {
        super(name,email);
    }
    public void sendMessage(String msg) {
        if(index<=messages.length-1) {
            messages[index++] = msg;
            return;
        }
        System.out.println("Sentbox is full.");
    }
    public void showSentbox() {
        System.out.printf("%s's Sendbox\n",userName);
        if(index==0) {
            System.out.println("No sent messages.");
            return;
        }
        for(int i = 0;i<index;i++) {
            System.out.println(messages[i]);
        }
    }
    @Override
    public String toString() {
        return String.format("%s\nMessages Sent: %d\n",super.toString(),index);

    }
}
