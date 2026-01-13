public class Array2dPrimarySecondayDiag {

    public static void main(String[] args) {
        // Creating a 2D array and printing it
        // This is a 3X4 Matrix
        int[][] arr2D = {
            {1, 2, 4, 4},
            {5, 6, 7, 1},
            {9, 0, 1, 9}
        };
		System.out.println("The 2D Array");
        printArray2D(arr2D);
        System.out.println("Printing Primary Diagonals");
        printPrimaryDiag(arr2D);
        System.out.println("Printing Secondary Diagonals");
        printSecondaryDiag(arr2D);
        
        System.out.println("-------------------------------");
        
        int[][] newArr2D = {
            {1, 2, 4},
            {5, 6, 7},
            {9, 0, 1}
        };

		System.out.println("The new 2D Array");
        printArray2D(newArr2D);
        System.out.println("Printing Primary Diagonals");
        printPrimaryDiag(newArr2D);
        System.out.println("Printing Secondary Diagonals");
        printSecondaryDiag(newArr2D);

    }

    public static void printPrimaryDiag(int[][] arr) {
        if( arr.length != arr[0].length )
            System.out.println("NOT SQAURE MATRIX");
        else{
            for (int r=0; r<arr.length; r++) {
                for (int c=0; c<arr[r].length; c++) {
                    if (r==c)
                        System.out.print(arr[r][c] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printSecondaryDiag(int[][] arr) {
        if( arr.length != arr[0].length )
            System.out.println("NOT SQAURE MATRIX");
        else{
            for (int r=0; r<arr.length; r++) {
                for (int c=0; c<arr[r].length; c++) {
                    if ( r+c == arr.length-1 )
                        System.out.print(arr[r][c] + " ");
                }
            }
            System.out.println();
        }
    }

    // Helper method to print a 2D array
    public static void printArray2D(int[][] arr) {
        for (int r=0; r<arr.length; r++) {
            for (int c=0; c<arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
