package demo;

public class Array2d {

  public static int[][] unlockSafe(int[][] mat, int[] com){
    int count = 0;
    while(count!= 4){
      com = mat[0];
      for(int i = 1; i<mat.length;i++){
        mat[i-1]= mat[i];
      }
       mat[mat.length-1] = com;
      count++;
    }
    return mat;

}
 public static void print2D(int[][] arr2D){
  for(int i = 0; i< arr2D.length ; i++){
    for(int j = 0; j< arr2D[0].length ; j++){
      System.out.print(arr2D[i][j] + " ");
    }
    System.out.println();
  }
 }

  public static void main(String[] args) {
    
  
  int[] arr = null;
  int[][] arr2D = {
    {2, 8, 9, 6, 7},
    {4, 2, 5, 8, 5},
    {6, 7, 1, 4, 3},
    {9, 6, 7, 2, 9},
    {7, 9, 3, 5, 6},
    {8, 1, 6, 9, 2},
    {5, 4, 2, 7, 1},
    {3, 3, 8, 1, 4},
    {1, 5, 4, 3, 8}
};
unlockSafe(arr2D, arr );
}
}
