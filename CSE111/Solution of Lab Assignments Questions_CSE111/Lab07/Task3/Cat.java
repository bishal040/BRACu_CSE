package Task3;

public class Cat extends Animal{
    public String breed;
    public Cat(String name,int age,String color, String breed) {
      super(name,age,color);
      this.breed = breed;
    } 
    public void makeSound() {
        System.out.printf("%s color %s is meowing\n",color,name);
    }
    public String info() {
        return super.info() + "Breed: "+ breed;
    }
}
