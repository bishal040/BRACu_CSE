import java.util.Scanner;
public class Task01{
    public static void main(String[] args)
    {
        int[] array =takeInput(10);
        //printArray(array);
        resultArray(array);
    }
    public static void resultArray(int[] arr)
    {
        int sum=0,min=arr[0],max=arr[0],count=0;
        boolean flag =true;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]<0 || arr[i]%2==0)
        continue;
        else
        {
            count++;
            while(flag)
            {
            if(arr[i]%2!=0)
                {
                 flag = false;
                }
            }
            if(count==0)
            {
                System.out.println("No odd positive numbers found");
            }
            else
            {
                sum+=arr[i];
                if(min<arr[i])
                {
                    min=min;
                }
                else
                {
                    min=arr[i];
                }
                if(max>arr[i])
                {
                    max=max;
                }
                else
                {
                    max=arr[i];
                }

            }
        }
        }
        double avg=(double)sum/count;
        if(count==0)
        System.out.println("No odd positive numbers found");
        else{
        System.out.println("Sum = " + sum);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        if(flag)
        System.out.println("No odd positive numbers found");
        else
        {
            System.out.println("Average = " + avg);
        }
        }
    }
    public static int[] takeInput(int num)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[num];
        System.out.println("Enter the numbers:");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
