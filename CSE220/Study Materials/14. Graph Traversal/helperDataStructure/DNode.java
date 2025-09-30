package helperDataStructure;

// DNode.java - Node for Doubly Linked List
public class DNode {
    Object elem;
    DNode next, prev;

    public DNode(Object elem) {
        this.elem = elem;
        this.next = this.prev = null;
    }
}