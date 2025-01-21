public class Stringprob {
    public static void main(String[] args) {
        String str = new String("Bishal");
        int sum = 0;
    
    
for(int i=0;i<=str.length()-1;i++)
{
     char cr = str.charAt(i);
     sum +=(int)cr;
     System.out.println(sum);
}
    }
}
