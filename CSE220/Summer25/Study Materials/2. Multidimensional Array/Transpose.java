




class Transpose{
  public static void main(String[] args){
    int[][] arr2D = {
        {1, 2, 4, 4},
        {5, 6, 7, 1},
        {9, 0, 1, 9}
    };
    
    int[][] tarr2D = transpose( arr2D );
    
    printArray2D( tarr2D );
  }
  
  public static int[][] transpose(int[][] arr2D){
    int row = arr2D.length;
    int col = arr2D[0].length;
    int[][] newA = new int[col][row];
    int newRow = newA.length;
    int newCol = newA[0].length;
    for( int i=0; i<newRow; i++ ){
      for( int j=0; j<newCol; j++ ){
        newA[i][j] = arr2D[j][i];
      }
    }
    return newA;
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