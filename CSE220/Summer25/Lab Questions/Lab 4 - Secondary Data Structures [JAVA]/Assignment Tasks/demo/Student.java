package demo;

public class Student {
  int id;
  double cgpa;
  String[] courses;
  int count = 0;
  public Student (int id){
    this.id = id;
    System.out.printf("A student with ID %d has been created.\n",id);
  }
  //contructor overloading
  public Student(int id , double cgpa){
    this.id = id;
    storeCG(cgpa);
    System.out.printf("A student with ID %d and cgpa %.1f has been created.\n",this.id,this.cgpa);
  }


  public void addCourse(String course){
    if(this.cgpa != 0){
      if(count<courses.length){
        courses[count]=course;
        count++;
      }
      else{
        System.out.printf("Failed to add %s\n" + //
                    "CG is low. Can't add more than %d courses.",course,courses.length);
      }
    }
    else{
      System.out.printf("Failed to add %s\n" + //
                "Set CG first\n",course);
    }
  }
  //overloading
  public void addCourse(String[] courses){
    int cnt = 0;
    
    for(int i =0; i< courses.length; i++){
      if(cnt < this.courses.length){
      addCourse(courses[i]);
      cnt++;
    }
    else{
    System.out.printf("Failed to add %s\n" + //
            "Maximum %d courses allowed.\n",courses[cnt],this.courses.length);
  }
  }
  
  }
  public void storeCG(double cgpa){
    this.cgpa = cgpa;
    if(this.cgpa<3){
      courses = new String[3];
    }
    else{
      courses = new String[4];
    }
  }
  public void showAdvisee(){
    System.out.printf("Student ID: %d, CGPA: %.1f\n",this.id,this.cgpa);
    if(count!=0){
      System.out.println("Added courses are:");
    for(int i =0;i<count;i++){
      System.out.print(courses[i] + " ");
    }
    System.out.println();
  }
  else{
    System.out.println("No courses added.");
  }
  }
  public void removeAllCourse(){
    for(int i =0;i<courses.length;i++){
      courses[i]=null;
    }
    count=0;
  }
  public void storeID(int id){
    this.id = id;
  }


}
