package Task3;

public class Striker extends Football{
    public int goals,shotOnTarget;
    public double performance;
    public Striker(String name,int age,int stamina, int goals,int shotOnTarget) {
        super(name,age,stamina);
        this.goals = goals;
        this.shotOnTarget = shotOnTarget;
    }
    @Override
    public void calculatePerformance() {
        performance = (double)goals/shotOnTarget;
        System.out.println("Performance: " + performance);
    }
    public void display() {
        super.display();
        System.out.printf("Goals: %d\nShots on target: %d\n",goals,shotOnTarget);
    }

}
