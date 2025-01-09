package Task1;
public class BBAStudent extends Student{

    public BBAStudent() {
       super.setName("Default");
       super.setDepartment("BBA");
    }
    public BBAStudent(String nm) {
        this();
        super.setName(nm);
    }
    
}
