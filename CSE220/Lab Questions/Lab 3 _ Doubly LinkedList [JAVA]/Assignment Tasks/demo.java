public class demo {
  public static void rearrangeMove(DNode dh, Object x) {
    DNode dummy = dh;
    DNode lessTail = dummy; // Tail of nodes < x
    DNode prev = dummy;
    DNode curr = dummy.next;
    int i = 0;
    while (curr != null && i< 3) {
        if (curr.elem != null && (int) curr.elem < (int) x) {
            if (lessTail.next == curr) {
                // Already in place, move pointers forward
                lessTail = curr;
                prev = curr;
                curr = curr.next;
            } else {
                // Remove curr from current position
                prev.next = curr.next;

                // Insert curr after lessTail
                curr.next = lessTail.next;
                lessTail.next = curr;

                // Update lessTail
                lessTail = curr;

                // Move to next node
                curr = prev.next;
            }
        } else {
            // Not less than x, move forward
            prev = curr;
            curr = curr.next;
        }
        i++;
    }
}
  
  public static void main(String[] args) {
        Object[] values = {1, 4, 3, 2, 5, 2};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {1, 2, 2, 4, 3, 5};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rearrangeMove(dh,3);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}

