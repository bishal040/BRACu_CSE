public class Array2D {

    public static void main(String[] args) {
        // Creating a 2D array and printing it
        // This is a 3X4 Matrix
        int[][] arr2D = {
            {1, 2, 4, 6},
            {5, 6, 7, 8},
            {9, 0, 1, 2}
        };
		System.out.println("The 2D Array");
        printArray2D(arr2D);
        System.out.println("First Row: ");
        printArray( arr2D[0] );
        System.out.println("Second Row: ");
        printArray( arr2D[1] );
        System.out.println("Accessing Second Row, Third Column: " + arr2D[1][2]);

        // Creating a 2x5 array with all elements initialized to 0
        arr2D = new int[2][5];
        int totalCells = arr2D.length * arr2D[0].length;
        int  rowLength = arr2D.length;
        int colLength = arr2D[0].length;
        
        System.out.println("Total Cell Count "+totalCells );        
        System.out.println("Row Length: " + rowLength + ", Column Length: " + colLength);
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
    // Helper method to print a Linear array
    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++)
        	System.out.print( arr[i]+" " );
        System.out.println();
	}
}
