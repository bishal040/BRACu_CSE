package Task3;

public class Dog extends Animal{
    public String breed;
  public Dog(String name,int age,String color, String breed) {
    super(name,age,color);
    this.breed = breed;
  }  
  public void makeSound() {
    System.out.printf("%s color %s is barking\n",color,name);
}
public String info() {
    return super.info() + "Breed: "+ breed;
}
}
