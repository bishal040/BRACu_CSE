class LinkedList{

    Node head;

    public LinkedList( Object elem ){
        this.head = new Node( elem );
    }

    //This Constructor will convert an Array into a LinkedList 
    public LinkedList( Object[] arr ){
        this.head = new Node( arr[0] );
        Node n = this.head;
        for ( int i=1; i<arr.length; i++ ){
            Node newN = new Node( arr[i] );
            n.next = newN;
            n = n.next;
        }
    }

    public void printLL(){
        Node n = this.head;
        while (n!=null){
            System.out.print(n.elem+" -> ");
            n = n.next;
        }
        System.out.println();
    }

    public int lengthLL(){
        int c = 0;
        Node n = this.head;
        while (n!=null){
            c++;
            n=n.next;
        }
        return c;
    }

    public Node nodeAt(int idx){
        int c = 0;
        Node n = this.head;
        while (n!=null){
            if (c==idx)
                return n;
            c++;
            n=n.next;
        }
        //if the index is invalid
        return null;
    }

    public void appendLL(Integer data){
        int len = lengthLL();
        Node lastNode = nodeAt( len-1 );
        Node newNode = new Node(data);
        lastNode.next = newNode;
    }
    
    public void prependLL(Integer data){
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAt(Integer data, int idx){
        if (idx<0 || idx>lengthLL()-1){
            System.out.println("Wrong Index");
        } else if (idx==0){
            prependLL(data);
        } else {
            Node newNode = new Node(data);
            Node before = nodeAt(idx-1);
            Node after = before.next;
            before.next = newNode;
            newNode.next = after;
        }
    }

    public void removeAt(int idx){
        if (idx<0 || idx>lengthLL()-1){
            System.out.println("Wrong Index");
        } else if (idx==0){
            Node rmNode = this.head;
            this.head = this.head.next;
            rmNode.next = null;
        } else if ( idx == lengthLL()-1 ){
            Node scndLastNode = nodeAt(idx-1);
            scndLastNode.next = null;
        }
         else {
            Node before = nodeAt(idx-1);
            Node after = before.next.next;
            Node rmNode = before.next;
            before.next = after;
            rmNode.next = null;
        }
    }

    public void reverseLL(){
        Node n = this.head;
        while (n!=null){
            Node after = n.next;
            //if the loop is running for the first time
            if ( n==this.head )
                n.next = null;
            else{
                n.next = head;
                head = n;
            }
            n = after;
        }
    }

    public void leftRotate(){
        int len = lengthLL();
        Node lastN = nodeAt(len-1);
        Node rmNode = head;
        lastN.next = this.head;
        head = head.next;
        rmNode.next = null;
    }

    public void rightRotate(){
        int len = lengthLL();
        Node scndLast = nodeAt(len-2);
        Node lastN = scndLast.next;
        lastN.next = this.head;
        head = lastN;
        scndLast.next = null;
    }

}