class DHDCL{

    DNode dHead;

    public DHDCL(){
        //creating the dummy head
        this.dHead = new DNode( null );
        //connecting next and prev with itself
        this.dHead.next = this.dHead.prev = this.dHead;
    }

    //overloaded constructor for adding only 1 element
    public DHDCL( Object elem ){
        //creating the dummy head
        this.dHead = new DNode( null );
        //now insert the element as the next node
        DNode newN = new DNode( elem );
        //creating circular connection
        newN.next = newN.prev = this.dHead;
        this.dHead.next = this.dHead.prev = newN;
    }

    //This Constructor will convert an Array into a LinkedList 
    public DHDCL( Object[] arr ){
        this.dHead = new DNode( null );
        this.dHead.next = this.dHead.prev = this.dHead;
        DNode n = this.dHead;
        for ( int i=0; i<arr.length; i++ ){
            DNode newN = new DNode( arr[i] );
            n.next = newN;
            newN.prev = n;
            n = newN;
        }
        n.next = this.dHead;
        this.dHead.prev = n;
    }

    public void printLL(){
        DNode n = this.dHead.next;
        while (n!=this.dHead){
            System.out.print(n.elem+" <-> ");
            n = n.next;
        }
        System.out.println();
    }

    public void printLLReverse(){
        DNode n = this.dHead.prev;
        while (n!=this.dHead){
            System.out.print(n.elem+" <-> ");
            n = n.prev;
        }
        System.out.println();
    }

    public int lengthLL(){
        int c = 0;
        DNode n = this.dHead.next;
        while (n!=this.dHead){
            c++;
            n=n.next;
        }
        return c;
    }

    public DNode nodeAt(int idx){
        int c = 0;
        DNode n = this.dHead.next;
        while (n!=this.dHead){
            if (c==idx)
                return n;
            c++;
            n=n.next;
        }
        //if the index is invalid
        return null;
    }

    public void appendLL(Integer data){
        DNode newNode = new DNode(data);
        DNode lastNode = this.dHead.prev;
        newNode.next = this.dHead;
        newNode.prev = lastNode;
        dHead.prev = lastNode.next = newNode;
    }
    
    public void prependLL(Integer data){
        DNode newNode = new DNode(data);
        DNode after = this.dHead.next;
        newNode.next = after;
        newNode.prev = this.dHead;
        this.dHead.next = after.prev = newNode;
    }

    public void insertAt(Integer data, int idx){
        if (idx<0 || idx>lengthLL()-1){
            System.out.println("Wrong Index");
        } else {
            DNode newNode = new DNode(data);
            DNode after = nodeAt(idx);
            DNode before = after.prev;
            newNode.prev = before;
            newNode.next = after;
            before.next = after.prev = newNode;
        }
    }

    public void removeAt(int idx){
        if (idx<0 || idx>lengthLL()-1){
            System.out.println("Wrong Index");
        } else {
            DNode rmNode = nodeAt(idx);
            DNode before = rmNode.prev;
            DNode after = rmNode.next;
            before.next = after;
            after.prev = before;
            rmNode.next = rmNode.prev = null;
        }
    }

    public void reverseLL(){
        DNode n = this.dHead;
        while (true){
            DNode after = n.next;
            DNode before =  n.prev;
            //reverse the connections
            n.next = before;
            n.prev = after;
            //move backward since the connections are
            //reversed
            n = n.prev;
            if (n==this.dHead) break;
        }
    }

}