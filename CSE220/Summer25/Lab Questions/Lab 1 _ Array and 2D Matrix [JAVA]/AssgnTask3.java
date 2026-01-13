//Assignment Task 03: Matrix Compression
class AssgnTask3{


    public static Integer[][] compressMatrix( Integer[][] matrix ){
        Integer[][] c_matrix = new Integer[(int)Math.sqrt(matrix.length)][(int)Math.sqrt(matrix.length)];
        for(int i=0;i<c_matrix.length;i++){
            for(int j=0;j<c_matrix.length;j++){
                c_matrix[i][j]=0;
                for(int k=0+i*c_matrix.length;k<(int)(i+1)*(matrix.length/c_matrix.length);k++){
                    for(int l=0+j*c_matrix.length;l<(int)(j+1)*(matrix.length/c_matrix.length);l++){
                        c_matrix[i][j] +=matrix[k][l];
                    }
                }
            }
        }
        return c_matrix;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}