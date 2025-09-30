public class StackTester {
    public static void main(String[] args) {
        System.out.println("=====Using Array Stack=====");
        ArrayStack stack = new ArrayStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push(1);
        stack.push(10);
        stack.push(6.2);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        
        System.out.println();

        LinkedListStack stack1 = new LinkedListStack();
        System.out.println("====Using Linked List Stack====");
        stack1.push("A");
        stack1.push("B");
        stack1.push("C");
        stack1.push(1);
        stack1.push(10);
        stack1.push(6.2);
        System.out.println("Top element: " + stack1.peek());
        System.out.println("Popped element: " + stack1.pop());
        System.out.println("Is stack empty? " + stack1.isEmpty()); 
    }
}