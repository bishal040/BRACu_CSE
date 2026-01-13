// AssignmentTask2: Sum of Nodes
public class AssignmentTask2 {
    
    // No need to submit this task
    public static int sumDist(Node head, Integer[] distArr) {
        Node temp = head;
        int count = 0,sum = 0;
        for(int i = 0;i<distArr.length;i++){
            temp = head;
            count=0;
        while(temp != null){
            if(count==distArr[i]){
                break;
            }
            count++;
            temp = temp.next;
        }
        if(temp != null){
            sum += (int)temp.elem;
         }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
