//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {
    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        return mirrorSum_helper(root.left, root.right);
    }
    //===============================================================   
    public static Integer mirrorSum_helper(BSTNode root1, BSTNode root2){
        if(root1 == null || root2 == null){
            return 0;
        }
        int sum = root1.elem + root2.elem;
        int leftSum = mirrorSum_helper(root1.left, root2.right);
        int rightSum = mirrorSum_helper(root1.right, root2.left);
        sum += leftSum + rightSum;
        return sum;
    }
}
