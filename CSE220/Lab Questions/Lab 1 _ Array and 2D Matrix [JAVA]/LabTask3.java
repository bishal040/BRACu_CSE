//Lab Task 03: Decryption Process
class LabTask3{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){
        Integer[] col_sum = new Integer[matrix[0].length];
        Integer[] col_dif = new Integer[matrix[0].length-1];
    

       for(int j=0;j<matrix[0].length;j++){
        col_sum[j]=0;
        for(int i=0;i<matrix.length;i++){
            col_sum[j]+=matrix[i][j];
        }
       }
       for(int i=0;i<col_dif.length;i++){
        col_dif[i]=col_sum[i+1]-col_sum[i];
       }
        return col_dif;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}