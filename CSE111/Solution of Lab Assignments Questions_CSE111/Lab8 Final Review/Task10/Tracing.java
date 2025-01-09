package Task10;

class Tracing {
    public static int a = 9, y = 5;
    public int x, b;
    public Tracing(int a, int b){
      x += a;
      y += b;
      this.a = this.x;
      this.b = this.y;
    }
    public int methodB(){
      System.out.println(this.a+" "+this.b+" "+x);
      b = y - this.b + Test.a;
      x += this.b;
      return this.b;
    }
   }
   
   