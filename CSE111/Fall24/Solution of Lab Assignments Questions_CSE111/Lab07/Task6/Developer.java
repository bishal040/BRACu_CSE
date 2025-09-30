package Task6;

public class Developer extends Employee{
    public String lang;
    public double Fsalary;
    public Developer(String name, int baseSalary, int hoursWorked, String lang) {
        super(name, baseSalary, hoursWorked);
        this.lang = lang;
    }
    public void calculateSalary() {
        if(this.lang.equals("Java")) {
            Fsalary =getBaseSalary()+700;
            return;
        }
        Fsalary = getBaseSalary();
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + lang);
        System.out.println("Final Salary: $" + Fsalary);
    }
}
