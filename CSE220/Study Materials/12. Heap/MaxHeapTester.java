public class Tester {
    public static void main(String[] args) {
        // Testing Heap Creation
        int[] elements = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};
        MaxHeap heap = new MaxHeap(15);

        for (int el : elements) {
            heap.insert(el);
        }

        System.out.println("After heap creation:");
        heap.printHeap();

        // Insertion test
        System.out.println("\nInserting 50:");
        heap.insert(50);
        heap.printHeap();

        // Extraction test
        System.out.println("\nExtracting max:");
        heap.extractMax();
        heap.printHeap();

        // Deletion test
        System.out.println("\nDeleting item at index 3:");
        heap.delete(3);
        heap.printHeap();

        // Heapsort test
        int[] toSort = {10, 4, 8, 5, 12, 2, 6, 11, 3, 9, 7, 1};
        System.out.println("\nBefore Heapsort:");
        for (int num : toSort) System.out.print(num + " ");
        System.out.println();

        HeapSort.sort(toSort);
        System.out.println("After Heapsort:");
        for (int num : toSort) System.out.print(num + " ");
        System.out.println();
    }
}
