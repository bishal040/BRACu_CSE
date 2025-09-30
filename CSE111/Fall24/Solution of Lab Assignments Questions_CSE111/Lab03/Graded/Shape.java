package Graded;
public class Shape{
    public double area;
    public String type;
    public void setParameters(String type,int radius)
    {
        this.type = type;
        this.area = Math.PI*Math.pow(radius,2);
    }
    public void setParameters(String type, int height , int base)
    {
        this.type = type;
        this.area = 0.5*height*base;
    }
    public void setParameters(String type,double length, double width)
    {   
        this.type = type;
        this.area = length*width;
    }
    public String details()
    {
        String str = "Shape name : " + type + "\n" + "Area: " + area;
        return str;
    }
}