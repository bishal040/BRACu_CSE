import java.util.Scanner;
public class exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rowsum = 0;
        
        
        int[][] arr = new int[a][b];
        System.out.println("Enter the elements Value");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sample Input: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Sample Output: ");
        for(int i=0;i<arr.length;i++)
        {
            rowsum = 0;
            for(int j=0; j<arr[i].length;j++)
            {
             rowsum += arr[i][j];
            }
            System.out.println("Sum of Row "+i+ " is: " + rowsum);
        }

    }
}
