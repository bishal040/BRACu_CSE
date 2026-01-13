public class AssignmentTask6 {

    //SUBMIT ONLY THIS METHOD
    public static void pairJoin(DNode dh1, DNode dh2) {
        DNode t1 = dh1.next;
        DNode t2 = dh2.next;
        DNode n1 = t1.next, n2 = t2.next;
        while(t1 != null && t2 != null && t1 != dh1 && t2 != dh2){
            n1 = t1.next;
            t1.next = t2;
            n2 = t2.next;
            t2.prev = t1;
            t2.next = n1;
            if(n1 != null && n1 !=dh1){
            n1.prev = t2;
            }
            t1 = n1;
            t2 = n2;
        }
        DNode lastN = dh1;
        while (lastN.next != dh1 && lastN.next != null) {
            lastN = lastN.next;
        }
        lastN.next = dh1;
        dh1.prev = lastN;
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
