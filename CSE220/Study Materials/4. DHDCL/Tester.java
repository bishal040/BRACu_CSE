class Tester {

    public static void main(String[] args){

        Integer[] arr = {11,2,33,55,22};
        DHDCL ll = new DHDCL(arr);

        System.out.println("Forward Printing: ");
        ll.printLL();
        System.out.println("Reverse Printing: ");
        ll.printLLReverse();
        
        System.out.println("\nTesting prepend/append/insertAt Function:");
        System.out.println("Prepend 10");
        ll.prependLL(10);
        ll.printLL();
        ll.printLLReverse();
        System.out.println("Append 999");
        ll.appendLL(999);
        ll.printLL();
        ll.printLLReverse();

        System.out.println("\ninsert 1000 at 3:");
        ll.insertAt(1000,3);
        ll.printLL();
        ll.printLLReverse();
        System.out.println("insert 1000 at 15:");
        ll.insertAt(7654,15);
        ll.printLL();
        ll.printLLReverse();
        
        System.out.println("\nTesting Remove Method:");
        System.out.println("remove index 15:");
        ll.removeAt(15);
        System.out.println("remove index 6:");
        ll.removeAt(6);
        ll.printLL();
        ll.printLLReverse();
    }

}