//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {
    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
       return isBST_helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    //     if(root.left== null && root.right == null ) return true;
    //     else if(root.left == null){
    //         if(root.elem < root.right.elem){
    //             return true && isBST(root.right);
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //     else if(root.right == null){
    //         if(root.elem > root.left.elem){
    //             return true && isBST(root.left);
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //    else{
    //     if(root.elem > root.left.elem && root.elem < root.right.elem){
    //         return true && isBST(root.left) && isBST(root.right);
    //     }
    //     else return false;
    //    }
     }
     public static Boolean isBST_helper(BSTNode root, int min_value, int max_value){
        if(root == null){
            return true;
        }
        if(root.elem < min_value || root.elem > max_value){
            return false;
        }
        boolean leftCheck = isBST_helper(root.left, min_value, root.elem);
        boolean rightCheck = isBST_helper(root.right, root.elem, max_value);
        return leftCheck && rightCheck;
     }
    //===============================================================
}
