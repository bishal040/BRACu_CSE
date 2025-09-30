public class Employee {
    public String name;
    public double salary = 30000;
    public String Designation = "junior";
    public void newEmployee(String N)
    {
        this.name=N;
        
    }
    public void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + " Tk");
        System.out.println("Employee Designation: " + Designation);
    }
    public void calculateTax(){
        if(salary>50000)
        {
            System.out.println(this.name + " Tax Amount: " + salary*0.3);
        }
        else if(salary>30000)
        {
            System.out.println(this.name + " Tax Amount: " + salary*0.1);
        }
        else
        {
            System.out.println("No need to pay tax");
        }

    }
    public void promoteEmployee(String N)
    {
        if(this.Designation!=N)
        {
            this.Designation=N;
            if(this.Designation.equals("senior"))
            {
                salary += 25000;
            }
            else if(this.Designation.equals("lead"))
            {
                salary += 50000;
            }
            else if(this.Designation.equals("manager"))
            {
                salary += 75000;
            }
            System.out.println(this.name + " has been promoted to " + Designation );
            System.out.println("New Salary: " + salary + " Tk");
        }
        else{
            System.out.println("Can not Promote to same Designation");
        }
    }
}
