package Graded;
public class Student{
    public String name = "Not Set";
    public String department = "CSE";
    public double cgpa ;
    public int credits = 9;
    public String status = "Not Set";

    public void showDetails()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("CGPA: " + this.cgpa);
        System.out.println("Credits: " + this.credits);
        System.out.println("Scholarship Status: " + this.status);
    }
    public void updateDetails(String name,double cgpa,int credit,String department)
    {
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        this.credits = credit;
    }
    public void updateDetails(String name, double cgpa,int credit)
    {
        this.updateDetails(name,cgpa,credit,this.department);
    }
    public void updateDetails(String name,double cgpa)
    {
        this.updateDetails(name,cgpa,this.credits,this.department);
    }
    public void checkScholarshipEligibility()
    {
        if(this.cgpa>=3.5 && this.credits>10)
        {
            if(this.cgpa>=3.5 && this.cgpa<3.7)
            {
                this.status="Need based scholarship";
            }
            else if(this.cgpa>=3.7 && this.cgpa<=4)
            {
                this.status ="Merit based scholarship";
            }
            System.out.println(this.name + " is eligible for " + this.status);
        }
        else
        {
            System.out.println(this.name + " is not eligible for Scholarship");
            this.status="No scholarship";
        }
    }
}
