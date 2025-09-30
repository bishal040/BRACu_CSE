class Tester {

    public static void main(String[] args){

        Integer[] arr = {11,2,33,55,22};
        LinkedList ll = new LinkedList(arr);

        ll.printLL();
        System.out.println("Head: "+ll.head.elem);
        System.out.println("The Node at index 2: "+ll.nodeAt(2) );
        System.out.println("The element at index 2: "+ll.nodeAt(2).elem );
        
        System.out.println("\nTesting prepend/append/insertAt Function:");
        System.out.println("Prepend");
        ll.prependLL(10);
        ll.printLL();
        System.out.println("Append");
        ll.appendLL(999);
        ll.printLL();

        System.out.println("\ninsert 1000 at 3");
        ll.insertAt(1000,3);
        ll.printLL();
        System.out.println("insert 1000 at 15");
        ll.insertAt(7654,15);
        
        System.out.println("\nTesting Remove Method:");
        ll.printLL();
        System.out.println("remove index 15");
        ll.removeAt(15);
        ll.printLL();
        System.out.println("remove index 8");;
        ll.removeAt(8);
        
        System.out.println("\nRight Rotation:");
        ll.printLL();
        ll.rightRotate();
        ll.printLL();
        ll.rightRotate();
        ll.printLL();
        ll.rightRotate();
        ll.printLL();
        System.out.println("\nLeft Rotation:");
        ll.printLL();
        ll.leftRotate();
        ll.printLL();
        ll.leftRotate();
        
        System.out.println("\nIn Place Reversal:");
        ll.printLL();
        ll.reverseLL();
        ll.printLL();
    }

}