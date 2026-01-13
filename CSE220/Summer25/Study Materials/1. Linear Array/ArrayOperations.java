public class ArrayOperations {

	public static void main(String[] args) {
        System.out.println("----------------------------------");
        int[] arr = {11, 22, 33, 44, 55};
        System.out.println("Before Left Shifting: ");
		printArr( arr );
        System.out.println("After Left Shifting: ");
        leftShift( arr );
        printArr( arr );
		System.out.println("----------------------------------");
        int[] arr1 = {11, 22, 33, 44, 55};
        System.out.println("Before Right Shifting: ");
		printArr( arr1 );
        System.out.println("After Right Shifting: ");
        rightShift( arr1 );
        printArr( arr1 );
       	System.out.println("----------------------------------");
       	int[] arr2 = {11, 22, 33, 44, 55};
       	System.out.println("Before Removing:");
		printArr( arr2 );
       	System.out.println("After Removing index 3:");
       	removeAt( arr2, 3 );
       	printArr( arr2 );
       	System.out.println("----------------------------------");
       	int[] arr3 = {11, 22, 33, 0, 0};
       	System.out.println("Before Inserting:");
		printArr( arr3 );
       	System.out.println("After Inserting 432 at index 1:");
       	insertAt( arr3, 1, 432 );
       	printArr( arr3 );
       	System.out.println("----------------------------------");
       	int[] arr4 = {11, 22, 33, 44, 55};
       	System.out.println("Before Left Rotating:");
		printArr( arr4 );
       	System.out.println("After Left Rotating Once:");
       	leftRotate( arr4 );
       	printArr( arr4 );
        System.out.println("----------------------------------");
       	int[] arr5 = {11, 22, 33, 44, 55};
       	System.out.println("Before Right Rotating:");
		printArr( arr5 );
       	System.out.println("After Right Rotating Once:");
       	rightRotate( arr5 );
       	printArr( arr5 );
        System.out.println("----------------------------------");
        
    }
	
	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
    public static void leftShift(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void rightShift(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;
    }

    public static void removeAt(int[] arr, int idx) {
		for (int i = idx; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void insertAt(int[] arr, int idx, int elem) {
        for (int i = arr.length - 1; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[idx] = elem;
    }

	public static void leftRotate(int[] arr) {
		int bkup = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = bkup;
    }

    public static void rightRotate(int[] arr) {
		int bkup = arr[ arr.length-1 ];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = bkup;
    }
    
}

// Something to think about
// 
// Now I want you to think, when trying to insert an element what if the array is full? We can't really insert into that array without losing the last element.
// We can do two things in that case:
// 1. Give error showing that, max capacity is reached.
// 2. Create a new array with extended size which can store the new elem.
// 
// 
// If you follow the solution 2, you've created a Dynamic Array. Python list is an example of a dynamic array.
// You can learn more about static and dynamic arrays  
// [from this video](https://www.youtube.com/watch?v=gDqQf4Ekr2A) (**Highly Recommended**).
// 
// ***Try Yourself:***
// 
// Write a function called insert(arr,idx,elem). You have to insert the **elem** at **idx** index. However, if there's no space left in the array. You must copy the array into a double sized array and then insert the element.
