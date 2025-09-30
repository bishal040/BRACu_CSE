public class Person{
    private String name;
    private int age;
    private String type;
    private Vaccine vaccine;
    boolean firstDose,secondDose;

    public Person(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public Person(String name, int age) {
        this(name,age,"General Citizen");
    }
    public void showDetail() {
        System.out.printf("Name: %s Age: %d Type: %s\n",name,age,type );
        System.out.println("Vaccine name:" + vaccine.getName());
        System.out.println("1st dose: " + (firstDose? "Given":"Not Given" ));
        System.out.println("2nd dose: "+ (secondDose?"Given":("Please come after " + vaccine.getRevisit() + " days")));
    }
    public void pushVaccine(Vaccine v) {
        this.pushVaccine(v,"1st Dose");
    }
    public void pushVaccine(Vaccine v,String dose) {
        if(dose.equals("1st Dose")) {
            vaccine = v;
            if(!firstDose) {
                if(type.equals("Student") || age>=25) {
                    firstDose = true;
                    System.out.println("1st dose done for " + name);
                }
                else {
                    System.out.printf("Sorry %s, Minimum age for taking vaccines is 25 years now.\n",name);
                }
            }
            else {
                System.out.println("Already 1st Dose Done");
            }
        }
        else {
            if(!secondDose) {
                if(vaccine == null || !vaccine.getName().equals(v.getName())) {
                    System.out.printf("Sorry %s, you can't take 2 different vaccines.\n",name);
                }
                else{
                    secondDose = true;
                    System.out.println("2nd dose done for "+ name);
                }
            }
            else{
                System.out.printf("Sorry %s, you already received both doses\n",name);
            }
        }
    }
}
