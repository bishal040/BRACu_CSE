public class Cargo {
    private static double capacity = 10.0;
    private static int count = 0;
    private int id;
    private String contents;
    private double weight;
    private boolean flag = false;
    public Cargo(String contents, double weight) {
        this.contents = contents;
        this.weight = weight;
        this.id = ++count;
    }
    public void details() {
        System.out.printf("Cargo ID: %d, Contents: %s, Weight: %.1f, Loaded: %b\n",id,contents,weight,flag);
    }
    public void load() {
     if(!flag) {
      if(capacity-weight<0) {
        System.out.println("Cannot load cargo, exceeds weight capacity");
        return;
      }
      capacity-=weight;
      System.out.printf("Cargo %d loaded for transport\n",id);
      flag = true;
     }
    }
    public void unload() {
        if(flag) {
         capacity += weight;
         flag = false;
         System.out.printf("Cargo %d unloaded\n",id);
         return;
        }
        System.out.println("Failed to unload");
        
    }
    public static double capacity() {
        return capacity;
    }
}
