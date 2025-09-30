public class MatrixRotation {
    public static void main(String[] args) {
        int temp;
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };
            int[][] result = new int[mat.length][mat[0].length];
            for(int i = 0; i<mat.length;i++)
            {
                for(int j=0;j<mat[i].length;j++)
                {
                    result[i][j]=mat[j][i];
                }
            }
            for(int i = 0; i<mat.length;i++)
            {
                temp = result[i][0];
                result[i][0]=result[i][2];
                result[i][2]=temp;
            }
            // for(int i = 0; i<mat.length;i++)
            // {
            //     for(int j=0;j<mat[i].length;j++)
            //     {
            //         System.out.print(result[i][j] + " ");
            //     }
            //     System.out.println("");
            // }
            for(int[] row : result)
            {
                for(int element : row)
                {
                 System.out.print(element + " ");
                }
                 System.out.println("");
            }
    }
}
