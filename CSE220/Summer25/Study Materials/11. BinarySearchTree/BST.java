public class BST {

    // Pre-order Traversal
    public static void printPreOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    // In-order Traversal
    public static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }

    // Post-order Traversal
    public static void printPostOrder(TreeNode root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    // Helper function to get leftmost node
    public static TreeNode getLeftMost(TreeNode n) {
        if (n != null && n.left != null) {
            return getLeftMost(n.left);
        } else {
            return n;
        }
    }

    // Helper function to get rightmost node
    public static TreeNode getRightMost(TreeNode n) {
        if (n != null && n.right != null) {
            return getRightMost(n.right);
        } else {
            return n;
        }
    }

    // Inorder Successor
    public static TreeNode inOrderSuccessor(TreeNode root, TreeNode n) {
        if (n.right != null) {
            return getLeftMost(n.right);
        } else {
            TreeNode successor = null;
            TreeNode current = root;
            while (current != null) {
                if (n.val > current.val) {
                    current = current.right;
                } else if (n.val < current.val) {
                    successor = current;
                    current = current.left;
                } else {
                    break;
                }
            }
            return successor;
        }
    }

    // Inorder Predecessor
    public static TreeNode inOrderPredecessor(TreeNode root, TreeNode n) {
        if (n.left != null) {
            return getRightMost(n.left);
        } else {
            TreeNode predecessor = null;
            TreeNode current = root;
            while (current != null) {
                if (n.val < current.val) {
                    current = current.left;
                } else if (n.val > current.val) {
                    predecessor = current;
                    current = current.right;
                } else {
                    break;
                }
            }
            return predecessor;
        }
    }

    // Search in BST
    public static TreeNode searchBST(TreeNode root, int x) {
        if (root == null) {
            return null;
        }
        if (root.val == x) {
            return root;
        } else if (x < root.val) {
            return searchBST(root.left, x);
        } else {
            return searchBST(root.right, x);
        }
    }

    // Insert in BST
    public static TreeNode insertBST(TreeNode root, int x) {
        if (root == null) {
            return new TreeNode(x);
        }
        if (x < root.val) {
            root.left = insertBST(root.left, x);
        } else if (x > root.val) {
            root.right = insertBST(root.right, x);
        }
        return root;
    }

    // Sorted Array to BST
    public static TreeNode sortedArrToBSTHelper(int[] arr, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedArrToBSTHelper(arr, left, mid - 1);
        root.right = sortedArrToBSTHelper(arr, mid + 1, right);
        return root;
    }

    public static TreeNode sortedArrToBST(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        return sortedArrToBSTHelper(arr, 0, arr.length - 1);
    }

    // Delete Node in BST
    public static TreeNode deleteBSTNode(TreeNode root, int x) {
        if (root == null) {
            return null;
        }
        if (x < root.val) {
            root.left = deleteBSTNode(root.left, x);
        } else if (x > root.val) {
            root.right = deleteBSTNode(root.right, x);
        } else {
            // Case 1: No children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            TreeNode successor = getLeftMost(root.right);
            root.val = successor.val;
            root.right = deleteBSTNode(root.right, successor.val);
        }
        return root;
    }

    // Function to demonstrate Successor and Predecessor
    public static void succAndPred(TreeNode root, TreeNode n) {
        TreeNode succ = inOrderSuccessor(root, n);
        TreeNode pred = inOrderPredecessor(root, n);
        System.out.println("InOrder Successor of " + n.val + " is " + (succ != null ? succ.val : "null"));
        System.out.println("InOrder Predecessor of " + n.val + " is " + (pred != null ? pred.val : "null"));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(7);
        root.right = new TreeNode(12);
        root.right.left = new TreeNode(11);
        root.right.left.left = new TreeNode(10);
        root.right.right = new TreeNode(22);
        root.right.right.left = new TreeNode(20);
        root.right.right.left.left = new TreeNode(19);
        root.right.right.right = new TreeNode(25);

        System.out.print("InOrder Traversal: ");
        printInOrder(root);
        System.out.println();

        System.out.println("-----------------------");
        succAndPred(root, root);
        System.out.println("-----------------------");
        succAndPred(root, root.left.left.left);
        System.out.println("-----------------------");
        succAndPred(root, root.right.right.left.left);

        // Search for a node
        TreeNode result = searchBST(root, 25);
        if (result == null) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found\nNode Description: " + result.val);
        }

        // Inserting nodes
        int[] arr = {11, 14, 15, 18, 19, 21, 25, 28, 30, 32, 70};
        TreeNode newRoot = new TreeNode(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insertBST(newRoot, arr[i]);
        }
        System.out.print("InOrder Traversal after insert: ");
        printInOrder(newRoot);
        System.out.println();

        // Sorted Array to BST
        int[] sortedArr = {5, 11, 12, 14, 15, 18, 19, 21, 23, 25, 27, 28, 30, 32, 37};
        TreeNode bstFromArr = sortedArrToBST(sortedArr);
        System.out.print("InOrder Traversal of BST from sorted array: ");
        printInOrder(bstFromArr);
        System.out.println();

        // Deleting nodes
        TreeNode rootForDeletion = new TreeNode(3);
        int[] arrForDeletion = {3, 11, 15, 16, 17, 18, 19, 20, 22, 23, 24, 28, 30, 31, 37};
        for (int i = 1; i < arrForDeletion.length; i++) {
            insertBST(rootForDeletion, arrForDeletion[i]);
        }

        System.out.print("InOrder before deletion: ");
        printInOrder(rootForDeletion);
        System.out.println("\nDeleting 37");
        rootForDeletion = deleteBSTNode(rootForDeletion, 37);
        System.out.print("InOrder after deletion: ");
        printInOrder(rootForDeletion);
    }
}