package demo;

public class demo {
    public static void main(String[] args) {
        int radius = 5;
        double area = circleArea(radius);
        System.out.println(area);
    }
    //circleArea(radius);  ----void
    //System.out.println(circleArea(radius)); ------returntype
    // double area = circleArea(radius); -----returntype

    // public static returntype methodName(dataType variablename)
  
    public static double circleArea(int r) {

        double areaaaa = Math.PI*r*r;
        return areaaaa;
    }
    
}
