package Task7;

public class Jackfruit extends Fruit {
    public Jackfruit() {
        super(false,"jackfruit");
    }
    @Override
    public String toString() {
        if(!super.hasFormalin()) {
            return String.format("%ss are good for you",super.getName());
        }
        return String.format("%ss are bad for you", super.getName());
    }
}
