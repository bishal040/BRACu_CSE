class LinkedListStack {
    
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    // Push method
    public void push(Object elem) {
        Node nn = new Node(elem, top);
        top = nn;
    }

    // Pop method
    public Object pop() {
        if (top == null) {
            // Stack underflow
            System.out.println("Stack Underflow!");
            return null;
        }
        Object e = top.elem;
        top = top.next;
        return e;
    }

    // Peek method
    public Object peek() {
        if (top == null) {
            // Stack underflow
            System.out.println("Stack Underflow!");
            return null;
        }
        return top.elem;
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == null;
    }

}