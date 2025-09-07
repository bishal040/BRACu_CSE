// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        
        return levelSum_helper(root,0,0);
    }
    public static Integer levelSum_helper(BTNode root, int lvl,int sum){
        if(root == null)return 0;
        if(lvl%2==0){
            return (Integer)sum-(Integer)root.elem +  levelSum_helper(root.left, lvl+1, sum) + levelSum_helper(root.right, lvl+1, sum);
        }
        else{
            
            return (Integer)sum+(Integer)root.elem +  levelSum_helper(root.left, lvl+1, sum) + levelSum_helper(root.right, lvl+1, sum);
        }
    }
    //============================================================================

}
