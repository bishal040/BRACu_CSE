import java.util.Scanner;
public class Task03{
  public static void main(String [] args)
  {
    char c;
    int result = 0;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1 = sc.nextLine();
    sc.close();
    String C_str = str + " " + str1;
    String C1_str = str + " " + str1;
    System.out.println(C_str);
    String str_won = new String(C1_str); 
      for(int i = 0; i<str_won.length(); i++)
      {
       c = str_won.charAt(i);
         if(c>=65 && c<=90 || c>=97 && c<=122)
       {
        result += (int)c;
       }
      }
      System.out.println(result);
  }
}
