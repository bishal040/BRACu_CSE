import java.util.Scanner;
public class Task04{
public static void main(String[] args)
{
  char c ;
  String result ="" ;
 Scanner sc = new Scanner(System.in);
 //String str = sc.nextLine();
 String str = new String(sc.nextLine());
 sc.close();
 for(int i=0; i<str.length();i++)
 {
   c = str.charAt(i);
   if(c == 'a')
   {
   result += (char)(c-1+26);
   }
   else
   {
     result +=(char)(c-1);
   }
 }
 System.out.println(result);
}
}