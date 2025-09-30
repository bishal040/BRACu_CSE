package Task5;

public class Dragon extends MagicalCreature{
    public int power;
    public Dragon(String name, int age, int power) {
        super(name,age);
        this.power=power;
    }
    @Override
    public void makeSound() {
        System.out.printf("%s roars with a fiery breath!\n",name);
    }
    @Override
    public void performMagic() {
        System.out.printf("%s breathes fire with power level: %d\n",name,power);
    }
    public void fly() {
        System.out.printf("%s flies through the sky.\n",name);
    }
}
