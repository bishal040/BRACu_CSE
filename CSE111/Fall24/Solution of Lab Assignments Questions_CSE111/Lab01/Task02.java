import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        primeInBetween(num1,num2);
    }

   public static void primeInBetween(int n1 , int n2)
    {
        int max=0,min=0,primeCount=0;
        if(n1>n2)
        {
            max=n1;
            min=n2;
        }
        else if(n1<n2)
        {
            max=n2;
            min=n1;
        }
        for(int i=min;i<=max;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }

            }
            if(count==2)
            {
                primeCount++;
            }

        }
        System.out.println("There are " + primeCount + " prime numbers between " + min +" and "+ max +".");
    }
}
