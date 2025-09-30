public class UniversityTester {
    public static void main(String[] args) {
        University Brac = new University();
        University NSU = new University();
        System.out.println(Brac);
        System.out.println(NSU);
        System.out.println(Brac.name);
        System.out.println(Brac.country);
        System.out.println(NSU.name);
        System.out.println(NSU.country);
        //NO the location of the objects are not the same
        Brac.name = "Imperial College London" ;
        Brac.country ="England";
        NSU.name = "Brac University";
        NSU.country = "Bangladesh";
        System.out.println(Brac.name);
        System.out.println(Brac.country);
        System.out.println(NSU.name);
        System.out.println(NSU.country);
        //the instance variables of both objects are not the same valu
    }
    
}
