public class Bird {
    String name = "Parrot";

    int meter = 0;
    public void flyUp(int num){
        meter+=num;
        System.out.println(this.name + " has flown up " + meter + " feet");
    }
    // public int flyUp(int num)
    // {
    //     int meter = 0;
    //     return 
    // }
    public void makeNoise()
    {
        if(this.name.equals("Parrot"))
        System.out.println("Squawk");
        if(this.name.equals("Eagle"))
        System.out.println("Squee");
    }
    public void flyDown(int num)
    {
        if(this.name.equals("Parrot"))
        meter+=3;

        if(meter-num<=0)
        {
            System.out.println(this.name + " has flown down " + meter + " feet and landed.");
        }
        else
        {
            System.out.println(this.name + " has flown down " + num + " feet.");
        }

    }
}
