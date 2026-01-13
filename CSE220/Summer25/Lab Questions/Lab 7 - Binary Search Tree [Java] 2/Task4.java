//Assignment Task (must Submit)
// Complete the rangeSum method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only three parameters
    // first one is the root of the given tree
    // second one the low range and third one is high range
    // You can use extra helper private static methods as per need
    public static Integer rangeSum( BSTNode root, Integer low, Integer high ){
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.elem >= low && root.elem <= high) {
            sum += root.elem;
        }
        if (root.elem > low) {
            sum += rangeSum(root.left, low, high);
        }
        if (root.elem < high) {
            sum += rangeSum(root.right, low, high);
        }
        return sum;
    }
    //===============================================================
}
