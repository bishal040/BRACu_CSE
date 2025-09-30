    public class MatrixRotationA {
        public static void main(String[] args) {
        int[][] mat = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };
        int [][] result = new int [mat.length][mat[0].length];
        int col = 0;
        for (int i = 0; i < mat.length; i++){
        int row = mat.length-1;
        for (int j = 0; j < mat[0].length; j++){
        result[i][j] = mat[row][col];
        row--;
        }
        col++;
        }
        System.out.println("Rotated Matrix:");
        for (int[] row : result) {
        for (int element : row) {
        System.out.print(element + " ");
        }
        System.out.println();
        }
        }
        }