class DNode{

    Object elem;
    DNode next;
    DNode prev;

    public DNode(Object elem, DNode next, DNode prev){
        this.elem = elem;
        this.next = next;
    }
    
    //Overloading
    public DNode(Object elem){
        this.elem = elem;
        this.next = null;
    }
}