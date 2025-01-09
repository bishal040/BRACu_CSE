package Task5;

public class Phoenix extends MagicalCreature{
    public int rebirth;
    public Phoenix(String name, int age, int rebirth) {
        super(name,age);
        this.rebirth = rebirth;
    }
    @Override
    public void makeSound() {
        System.out.printf("%s sings an enchanting song.\n",name);
    }
    @Override
    public void performMagic() {
        System.out.printf("%s is reborn with %d rebirth cycles\n",name,rebirth);
    }
    public void regenerate() {
        rebirth++;
        System.out.println("Fawkes regenerates its body in a burst of flames.");
    }
}
