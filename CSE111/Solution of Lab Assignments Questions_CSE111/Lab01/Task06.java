import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int num = sc.nextInt();
        int[] array = takeInput(num);
        sc.close();
        boolean[] boolArray = new boolean[array.length];
        for(int i = 0; i< array.length ; i++)
        {
           int count = 0;
            for(int j = i; j< array.length ; j++)
            {
                if(!boolArray[j])
                {
                    if(array[i]==array[j])
                    {
                    count++;
                    boolArray[j]=true;
                    }
                }
                else
                {
                    break;
                }
            }
            if(count!=0)
            System.out.println(array[i] + " - " + count + " times");
        }
    }
    public static int[] takeInput(int num)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
}
