public class BinaryTree {

    // Method to convert an array representation of a tree to an actual tree structure
    public static TNode arrToTree(String[] arr, int i) {
        if (i < arr.length && arr[i] != null) {
            TNode root = new TNode(arr[i]);
            root.left = arrToTree(arr, 2 * i); // Left child at 2*i index
            root.right = arrToTree(arr, 2 * i + 1); // Right child at 2*i+1 index
            return root;
        }
        return null; // Return null for invalid index or null value
    }

    // Method to print PreOrder traversal (D -> L -> R)
    public static void printPreOrder(TNode root) {
        if (root != null) {
            System.out.print(root.val + " "); // Visit the root
            printPreOrder(root.left); // Traverse the left subtree
            printPreOrder(root.right); // Traverse the right subtree
        }
    }

    // Method to print InOrder traversal (L -> D -> R)
    public static void printInOrder(TNode root) {
        if (root != null) {
            printInOrder(root.left); // Traverse the left subtree
            System.out.print(root.val + " "); // Visit the root
            printInOrder(root.right); // Traverse the right subtree
        }
    }

    // Method to print PostOrder traversal (L -> R -> D)
    public static void printPostOrder(TNode root) {
        if (root != null) {
            printPostOrder(root.left); // Traverse the left subtree
            printPostOrder(root.right); // Traverse the right subtree
            System.out.print(root.val + " "); // Visit the root
        }
    }

    // Method to get the level of a node with a specific value
    public static int getLevel(TNode root, String value, int level) {
        if (root == null) {
            return -1; // Base case: value not found
        } else if (root.val.equals(value)) {
            return level; // Return the current level if value is found
        }

        // Search in the left subtree
        int leftLevel = getLevel(root.left, value, level + 1);
        // Search in the right subtree
        int rightLevel = getLevel(root.right, value, level + 1);

        // If value not found in both subtrees
        if (leftLevel == -1 && rightLevel == -1) {
            return -1;
        }

        // Return the level where the value is found
        return Math.max(leftLevel, rightLevel);
    }

    // Method to get the height of a node
    public static int getHeight(TNode node) {
        if (node == null) {
            return -1; // Base case: height of null is -1
        }

        // Recursively calculate height of left and right subtrees
        int leftHeight = 1 + getHeight(node.left);
        int rightHeight = 1 + getHeight(node.right);

        // Return the maximum of the two heights
        return Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        // Tree represented as a 1-based array
        String[] treeArr = {null, "A", "B", "C", "D", "E", "F", "G", "H", null, null, null, "I", "J", null, "K"};
        TNode root = arrToTree(treeArr, 1);

        // Print PreOrder Traversal
        System.out.print("PreOrder Traversal: ");
        printPreOrder(root);
        System.out.println();

        // Print InOrder Traversal
        System.out.print("InOrder Traversal: ");
        printInOrder(root);
        System.out.println();

        // Print PostOrder Traversal
        System.out.print("PostOrder Traversal: ");
        printPostOrder(root);
        System.out.println();

        // Print levels of specific nodes
        System.out.println("--------------------------------------------");
        System.out.println("Level of 'A': " + getLevel(root, "A", 0));
        System.out.println("Level of 'F': " + getLevel(root, "F", 0));
        System.out.println("Level of 'H': " + getLevel(root, "H", 0));
        System.out.println("Level of 'K': " + getLevel(root, "K", 0));

        // Print heights of specific nodes
        System.out.println("----------------");
        System.out.println("Height of '" + root.val + "': " + getHeight(root));
        System.out.println("Height of '" + root.left.val + "': " + getHeight(root.left));
        System.out.println("Height of '" + root.right.left.val + "': " + getHeight(root.right.left));
    }
}
