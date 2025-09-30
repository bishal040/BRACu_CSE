package Task3;

public class Defender extends Football{
    public int tackle,intercept;
    public double performance;
    public Defender(String name,int age,int stamina, int tackle,int intercept) {
        super(name,age,stamina);
        this.tackle = tackle;
        this.intercept = intercept;
    }
    @Override
    public void calculatePerformance() {
        performance = (double)intercept/tackle;
        System.out.println("Performance: " + performance);
    }
    public void display() {
        super.display();
        System.out.printf("Goals: %d\nInterceptions: %d\n",tackle,intercept);
    }
}
