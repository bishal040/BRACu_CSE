package Task11;

public class Tester {
   public static void main(String[] args) {
    int[] n = {23};
    A a1 = new A(3);
    B b1 = new B();
    B b2 = new B(b1);
    a1.methodA(1, n);
    b2.methodB(3, 2);
    a1.methodA(1, n);

   }  
}
