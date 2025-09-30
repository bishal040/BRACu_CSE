package Task4;

public class Vehicle2010 extends Vehicle {
    public Vehicle2010() {
        super();
    }
    public void moveLowerLeft() {
        moveDown();
        moveLeft();
    }
    public void moveUpperRight() {
        moveUp();
        moveRight();
    }
    public void moveLowerRight() {
        moveDown();
        moveRight();
    }
}
