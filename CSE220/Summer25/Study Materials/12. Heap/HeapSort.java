public class HeapSort {
    public static void sort(int[] arr) {
        MaxHeap heap = new MaxHeap(arr.length);

        for (int value : arr) {
            heap.insert(value);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = heap.extractMax();
        }
    }
}
