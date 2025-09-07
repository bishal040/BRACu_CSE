//LAB TASK NO NEED TO SUBMIT
// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
           return helper_sumTree(root, 0 ,0);
           
        }
        public static Integer helper_sumTree(BTNode root, int lvl , int sum){
            if(root == null){
                return 0;
            }
            int temp = 0;
            if(lvl ==0){
                temp = (int)root.elem;
            }
            else{
                temp = (int)root.elem%lvl;
            }
            lvl++;
           sum = helper_sumTree(root.left, lvl, sum) + helper_sumTree(root.right, lvl, sum);
           
            return temp + sum;
        }
        //============================================================================

}
