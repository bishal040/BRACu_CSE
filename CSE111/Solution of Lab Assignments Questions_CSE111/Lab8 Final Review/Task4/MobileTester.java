package Task4;

public class MobileTester {
    public static void main(String[] args) {
      Nokia N3110 = new Nokia("N3110", true, "IMEI-102", 0);
      System.out.println(N3110);  
      System.out.println("1========================");
      Nokia N1100 = new Nokia("N1100", false, "IMEI-124", 100);
      System.out.println(N1100);
      System.out.println("2========================");
      System.out.println(N3110.dialCall("88017196xxxx"));
      System.out.println("3========================");
      N3110.rechargeSIMCard(200);
      N1100.rechargeSIMCard(300);
      System.out.println("4========================");
      System.out.println(N3110.dialCall("88017196xxxx"));
      System.out.println("5========================");
      System.out.println(N1100.dialCall("45517196xxxx"));
      System.out.println("6========================");
      N1100.activateSimCard();
      System.out.println("7========================");
      System.out.println(N1100.dialCall("45517196xxxx"));
      System.out.println("8========================");
      System.out.println(N1100.dialCall("96617196xxxx"));
    }
  }
  