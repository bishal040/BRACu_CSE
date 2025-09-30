public class Task09 {
    public static void main(String[] args) {
        // int [ ] [ ] A = {{1, 0, 0, 1},
        //                 {0, 1, 0, 0},
        //                 {1, 0, 1, 0},
        //                 {0, 1, 0, 1}};
        int [ ] [ ] A = {{1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1}};
    identityMatrix(A);
    }
    public static void identityMatrix(int[][] arr)
    {
        boolean flag = true;
        for(int i = 0; i<arr.length ; i++)
        {
            for(int j = 0; j<arr.length ; j++)
            {
                
                if(i==j && arr[i][j]!=1)
                {
                    flag = false;
                }
                if( i!=j && arr[i][j]!=0)
                {
                    flag = false;
                }

                if(!flag)
                {
                    break;
                }
            }
        }
        if(flag)
        {
            System.out.println("Identity Matrix");
        }
        else
        {
            System.out.println("Not an Identity Matrix");
        }
    }
}
