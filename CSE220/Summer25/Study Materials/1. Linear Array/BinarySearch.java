public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArr = {1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59};
		System.out.println("The Sorted Array:");
		for(int i=0; i<sortedArr.length; i++)
			System.out.print(sortedArr[i]+" ");
		System.out.println();

		//[Binary Search Simulation]
		//(https://pbaumgarten.com/ib-compsci/unit-4/binary-and-linear-search-animations.gif "Segment")

        int elem = 37;
        System.out.println("Searching "+elem+" in the array...");
        int idx = binarySearch(sortedArr, elem);
        
        if (idx != -1) {
            System.out.println(elem + " was found at index " + idx);
        } else {
            System.out.println(elem + " was not found in the array.");
        }
    }
    
    public static int binarySearch(int[] arr, int search) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == search) {
                return mid;
            } else if (search > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // If the element is not found, return -1
        return -1;
    }

}
