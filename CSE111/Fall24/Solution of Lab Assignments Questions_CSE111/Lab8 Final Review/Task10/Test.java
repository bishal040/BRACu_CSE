package Task10;

public class Test {
    public static int a=3;
    public int b=7, c;
    public Test(){
      methodA(a+4);
    }
    public void methodA(int a){
      Tracing t = new Tracing(2,7);
      a = Tracing.a+ Test.a;
      c = b + a + t.methodB();
      System.out.println(this.a+" "+this.b+" "+c);
    }
   }
   
   
