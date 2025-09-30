package Task5;

public class ComplexNumber extends RealNumber{
    public double imaginaryValue;
    public ComplexNumber(double r, double i) {
        super(r);
        this.imaginaryValue = i;
    }
    public ComplexNumber() {
        super(1);
        this.imaginaryValue = 1;
    }
    public String toString() {
      return super.toString() + "\nImaginaryPart: " + imaginaryValue;
    }
}
