public class Course{
 public String courseName;
 public String courseCode;
 public int credit;
 public void updateDetails(String N,String C, int c1)
 {
 this.courseName = N;
 this.courseCode = C;
 this.credit = c1;
 }
 public void displayCourse()
 {
   System.out.println("Course Name:");
   System.out.println(this.courseName);
   System.out.println("Course Code: " + this.courseCode);
  
   System.out.println("Course Credit: " + this.credit);
  
 }
}