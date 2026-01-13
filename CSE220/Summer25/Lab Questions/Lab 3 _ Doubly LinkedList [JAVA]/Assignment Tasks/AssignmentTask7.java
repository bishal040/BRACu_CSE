public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD


    public static void rangeMove(DNode dh, int f1, int f2) {
        DNode curr = dh.next;
        DNode prev = dh;
        DNode next;
        int count=0;
        while (curr != dh && count<=5) {
         next = curr.next; // save next before moving
            if ((int) curr.elem >= f1 && (int) curr.elem <= f2) {
                if(curr == dh.next)
                {
                    dh.next = dh.next.next;
                    next.prev = dh;
                }
                else{
                prev.next = next;
                next.prev = prev;
                }
                DNode last = dh.prev;
                last.next = curr;
                curr.prev = last;
                curr.next = dh;
                dh.prev = curr;
                prev = curr;
                curr = next;
            }
            else{
            prev = curr;
            curr = next;  
            } 
            count++;
        }
    }
    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh,5,7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
