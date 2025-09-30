public class MaxHeap {
    private Integer[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new Integer[capacity + 1];
        heap[0] = null; // index 0 is unused
        size = 0;
    }

    public int size() {
        return size;
    }

    public Integer max() {
        return heap[1];
    }

    public void insert(int item) {
        if (size + 1 == heap.length) {
            System.out.println("No space left for " + item);
            return;
        }
        heap[++size] = item;
        swim(size);
    }

    public Integer extractMax() {
        if (size == 0) return null;
        int max = heap[1];
        heap[1] = heap[size];
        heap[size--] = null;
        sink(1);
        return max;
    }

    public Integer delete(int idx) {
        if (idx > size || heap[idx] == null) return null;
        int deleted = heap[idx];
        swap(idx, 1);
        extractMax();
        return deleted;
    }

    private void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= size) {
            int j = 2 * k;
            if (j < size && heap[j] < heap[j + 1]) j++;
            if (heap[k] >= heap[j]) break;
            swap(k, j);
            k = j;
        }
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
