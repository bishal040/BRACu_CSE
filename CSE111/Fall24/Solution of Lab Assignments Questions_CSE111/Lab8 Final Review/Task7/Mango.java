package Task7;

public class Mango extends Fruit{
    public Mango() {
        super(true,"Mango");
    }
    @Override
    public String toString() {
        if(!super.hasFormalin()) {
            return String.format("%ss are good for you",super.getName());
        }
        return String.format("%ss are bad for you", super.getName());
    }
}
