import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int num = sc.nextInt();
        int[] array =takeInput(num);
        sc.close();
        printRevArray(array);  
    }
    public static int[] takeInput(int num) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void printArray(int[] array) {

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void printRevArray(int[] arr) {

        if(arr.length%2==0)
        {
            for(int i=0;i<=arr.length/2;i++)
                {
                    
                    int temp = arr[i];
                    arr[i]=arr[arr.length-1-i];
                    arr[arr.length-1-i]=temp;
                }       
        }
        else
        {
            for(int i=0;i<arr.length/2;i++)
            {
                int temp = arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            } 
        }
        printArray(arr);
    }
}
