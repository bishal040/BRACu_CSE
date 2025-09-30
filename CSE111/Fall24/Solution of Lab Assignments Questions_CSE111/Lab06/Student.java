public class Student {
    private static int total_std,cse_total,other_total;
    private int id=1;
    private String name,dept="CSE";
    private double cgpa;
    public Student(String name, double cgpa, String dept ) {
        this.name = name;
        this.cgpa = cgpa;
        this.dept = dept;
        total_std++;
        if(dept.equalsIgnoreCase("CSE")) {
            cse_total++;
            return;
        }
        other_total++;
    }
    public Student(String name, double cgpa) {
        this(name,cgpa,"CSE");
    }
    public static void printDetails() {
        System.out.printf("Total Student(s): %d\nCSE Student(s): %d\nOther Department Student(s): %d\n",total_std,cse_total,other_total);
    }
    public void individualDetail() {
        System.out.printf("ID: %d\nName: %s\nCGPA: %.2f\nDepartment: %s\n",id,name,cgpa,dept);
    }

}
