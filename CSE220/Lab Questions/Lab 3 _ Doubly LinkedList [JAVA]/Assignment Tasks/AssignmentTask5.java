public class AssignmentTask5 {

    //SUBMIT ONLY THIS METHOD
    public static void sumOddAppend(Node dh) {
         int sum = 0;
         Node temp = dh.next;
         Node prev = dh;
         while(temp!= dh){
            if((int)temp.elem%2!=0){
                sum += (int)temp.elem;
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
         }
         Node newN = new Node((Object)sum);
         prev.next = newN;
         newN.next = dh;
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {11, 22, 33, 44, 55, 66};
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = {22, 44, 66, 99};
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);
        
        //Running the Sum Odd Append
        sumOddAppend(head);
        //Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}
