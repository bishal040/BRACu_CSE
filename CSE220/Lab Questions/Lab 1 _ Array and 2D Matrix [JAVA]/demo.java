class demo {
    public static int[] findDiagonalOrder(int[][] mat) {
        int[] result = new int[mat.length*mat[0].length];
        int count =0,rc = 0, cc = 0,temp=0;
        for(int i = 0; i<=(mat.length-1+mat[0].length-1);i++){
            if(i%2==0 && rc+cc==i){
                result[count++]=mat[temp++][cc];
            }
            else{
                result[count++]=mat[rc][temp++];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2},{3,4}};
        int[] result = findDiagonalOrder(arr);
        for(int element:result){
            System.out.print(element + " ");
        }
    }
}