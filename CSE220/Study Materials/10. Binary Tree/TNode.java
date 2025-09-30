// Class representing a Tree Node
class TNode {
    String val; // Value of the node
    TNode left; // Left child of the node
    TNode right; // Right child of the node

    // Constructor for node with value and children
    public TNode(String val, TNode left, TNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // Constructor for node with only a value
    public TNode(String val) {
        this(val, null, null);
    }
}
