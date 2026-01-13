public class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        if(y+k > grid.length){
            return grid;
        }
        int temp;
        for(int i = x; i<grid.length; i++){
            for(int j = y; j<k; j++){
                temp = grid[i][j];
                grid[i][j] = grid[grid.length-1-i][j];
                grid[grid.length-1-i][j] = temp; 
            }
        }
        return grid;
    }
}
public static void main(String[] args){
  reverseSubmatrix();
}
