public class Circle {
    public static int count;
    private double radius;
    public double area;

    public Circle(double radius) {
        setRadius(radius);
        count++;
    }

    public double area() {
        area = Math.PI * radius * radius;
        return area;
    }

    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

}
