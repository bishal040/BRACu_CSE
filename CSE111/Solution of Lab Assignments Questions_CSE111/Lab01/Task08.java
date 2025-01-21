import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("column = ");
        int column = sc.nextInt();
        int[][] array2D = take2DInput(row,column);
        sc.close();
        print2DArray(array2D);
        System.out.println("");
        int[] array1D = convert1Dto2D(array2D);
        print1DArray(array1D);
    }

    public static int[][] take2DInput(int r,int c)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[r][c];
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = 0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }
        sc.close();
        return arr;
    }

    public static void print2DArray(int[][] arr){
        System.out.println("2D Array:");
        for(int i = 0; i <arr.length;i++)
        {
            for(int j = 0; j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        System.out.println("");
        }
    }
    public static int[] convert1Dto2D(int[][] arr2D){
        int[] arr1D = new int[arr2D.length*arr2D[0].length];
        for(int i = 0; i< arr2D.length;i++)
        {
            for(int j = 0;j<arr2D[i].length;j++)
            {
                arr1D[i*arr2D[i].length+j]=arr2D[i][j];
            }
        }
        return arr1D;
    }
        public static void print1DArray(int[] array){
        System.out.println("1D Array: ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
