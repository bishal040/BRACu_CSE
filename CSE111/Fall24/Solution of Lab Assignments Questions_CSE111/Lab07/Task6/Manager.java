package Task6;

public class Manager extends Employee{
    public int bonus;
    public double Fsalary;
    public Manager(String name, int baseSalary , int hoursWorked , int bonus) {
        super(name, baseSalary, hoursWorked);
        this.bonus = bonus;
    }
    public void calculateSalary() {
        if(getHoursWorked()>40){
        Fsalary = getBaseSalary() + getBaseSalary()*bonus/100.0;
        return;
        }
        Fsalary = getBaseSalary();
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus + "%");
        System.out.println("Final Salary: $" + Fsalary);
    }
    public void requestIncrement(int increment) {
        if(getHoursWorked()>100) {
            setBaseSalary(getBaseSalary()+increment);
            System.out.printf("$%d Increment approved.\n",increment);
            return;
        }
        if(getHoursWorked()>80 && getHoursWorked()<=100) {
            setBaseSalary(getBaseSalary()+increment/2);
            System.out.printf("$%d Increment approved.\n",increment);
            return;
        }
        System.out.println("Increment denied.");
    }

}
