class ArrayStack {
    
    private Object[] stack;
    private int top;

    // Constructor to initialize the stack
    // for 5 length
    public ArrayStack() {
        this.stack = new Object[5];
        this.top = -1;
    }

    // Method to push an element onto the stack
    public void push(Object obj) {
        if (top+1 == stack.length) {
            System.out.println("Stack Overflow!!!");
        } else {
            this.stack[this.top+1] = obj;
            this.top++;
        }
    }

    // Method to pop an element from the stack
    public Object pop() {
        if (this.top == -1) {
            System.out.println("Stack Underflow!!!");
            return null;
        } else {
            Object removed = this.stack[this.top];
            this.stack[this.top] = null; // Clear the popped element
            this.top--;
            return removed;
        }
    }

    // Method to peek the top element of the stack
    public Object peek() {
        if (this.top == -1) {
            return null;
        } else {
            return this.stack[this.top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

}
