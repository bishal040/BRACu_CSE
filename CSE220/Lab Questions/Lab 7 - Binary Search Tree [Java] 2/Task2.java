//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
       if(root==null){
        return "No Path Found";
       }
       if(root.elem>key){
           String pathLeft = findPath(root.left, key);
           if(pathLeft.equals("No Path Found")){
            return pathLeft;
           }
           else{
            return Integer.toString(root.elem) + " " + pathLeft;
           }
        }
        else if(root.elem<key){
            String pathRight = findPath(root.right, key);
            if(pathRight.equals("No Path Found")){
             return pathRight;
            }
            else{
             return Integer.toString(root.elem) + " " + pathRight;
            }
        }
        if(root.elem == key){
         return Integer.toString(root.elem) + " ";
        }
        return "No Path Found";
    }
    //============================================================================

}
