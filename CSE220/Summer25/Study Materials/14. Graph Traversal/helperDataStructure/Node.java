package helperDataStructure;

class Node {

    Object elem;
    Node next;

    public Node(Object elem){
        this.elem = elem;
    }

    //Overloaded
    public Node(Object elem, Node next){
        this.elem = elem;
        this.next = next;
    }

}
