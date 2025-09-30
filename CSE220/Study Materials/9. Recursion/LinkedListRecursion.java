public class LinkedListRecursion {

    public static void main(String[] args) {
        int[] arr = {4, 45, 76, 9870, 34, 532};
        Node head = arr2LL(arr);
        
        System.out.println("Print Linked List Forward:");
        printForward(head);
        
        System.out.println("Print Linked List Backward:");
        printBackward(head);
        
        int[] arr2 = {76, 34, 543, 234, 5, 67, 65, 43};
        Node head2 = arr2LL_recursion(arr2);
        System.out.println("Print Linked List Forward (Recursion):");
        printForward(head2);
        
        System.out.println("Print Linked List Backward (Recursion):");
        printBackward(head2);
    }

    // Convert array to Linked List (iterative version)
    static Node arr2LL(int[] arr) {
        Node head = new Node(arr[0], null);
        Node n = head;
        for (int i = 1; i < arr.length; i++) {
            n.next = new Node(arr[i], null);
            n = n.next;
        }
        return head;
    }

    // Convert array to Linked List using Recursion
    static Node arr2LL_recursion(int[] arr) {
        return arr2LL_recursion_helper(0, arr, null);
    }

    // Helper function for recursive conversion
    static Node arr2LL_recursion_helper(int i, int[] arr, Node n) {
        if (i == arr.length) {
            return n;
        } else {
            Node newNode = new Node(arr[i], n);
            return arr2LL_recursion_helper(i + 1, arr, newNode);
        }
    }

    // Print Linked List Forward
    static void printForward(Node n) {
        if (n == null) {
            System.out.println();
            return;
        }
        System.out.print(n.elem + " => ");
        printForward(n.next);
    }

    // Print Linked List Backward
    static void printBackward(Node n) {
        if (n == null) {
            System.out.println();
            return;
        }
        printBackward(n.next);
        System.out.print(n.elem + " <= ");
    }
}
