class MatrixMatrixMul{

    public static void main(String[] args){

        int[][] mat1 = {
            {1, 2, 0, 3},
            {2, 0, 1, 2},
            {3, 1, 4, 2}
        };

        int[][] mat2 = {
            {1, 2, 4},
            {4, 1, 2},
            {1, 0, 1},
            {2, 1, 3}
        };

        System.out.println("Matrix 1");
        printArray2D(mat1);
        System.out.println("Matrix 2");
        printArray2D(mat2);
        int m1Row = mat1.length, m1Col = mat1[0].length; 
        int m2Row = mat2.length, m2Col = mat2[0].length;
        // Creating the new matrix
        
        int[][] newMat = new int[m1Row][m2Col];
        for (int r=0; r<m1Row; r++){
            for (int c=0; c<m2Col; c++){
                int sum = 0;
                for (int k=0; k<m2Row; k++ ){
                    sum += mat1[r][k]*mat2[k][c];
                }
                newMat[r][c] = sum;
            }
        }
        System.out.println("Result Matrix");
        printArray2D(newMat);
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