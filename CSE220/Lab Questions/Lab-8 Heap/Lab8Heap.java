public class Lab8Heap {

    // ------------------- MinHeap -------------------
    static class MinHeap {
        private int[] heap;
        private int size;
        private int capacity;

        public MinHeap(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.heap = new int[capacity];
        }

        public void insert(int val) {
            if (size == capacity) throw new RuntimeException("Heap is full");
            heap[size] = val;
            swim(size);
            size++;
        }

        private void swim(int i) {
            while (i > 0 && heap[(i - 1) / 2] > heap[i]) {
                swap(i, (i - 1) / 2);
                i = (i - 1) / 2;
            }
        }

        public int extractMin() {
            if (size == 0) throw new RuntimeException("Heap is empty");
            int root = heap[0];
            heap[0] = heap[size - 1];
            size--;
            sink(0);
            return root;
        }

        private void sink(int i) {
            while (2 * i + 1 < size) {
                int j = 2 * i + 1;
                if (j + 1 < size && heap[j + 1] < heap[j]) j++;
                if (heap[i] <= heap[j]) break;
                swap(i, j);
                i = j;
            }
        }

        private void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        public int[] sort() {
            int[] result = new int[size];
            int tempSize = size;
            for (int i = 0; i < tempSize; i++) {
                result[i] = extractMin();
            }
            // restore sorted array into heap
            for (int i = 0; i < tempSize; i++) {
                heap[i] = result[i];
            }
            size = tempSize;
            return result;
        }

        public int[] getHeapArray() {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = heap[i];
            return arr;
        }
    }

    // ------------------- MaxHeap -------------------
    static class MaxHeap {
        private int[] heap;
        private int size;
        private int capacity;

        public MaxHeap(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.heap = new int[capacity];
        }

        public void insert(int val) {
            if (size == capacity) throw new RuntimeException("Heap is full");
            heap[size] = val;
            swim(size);
            size++;
        }

        private void swim(int i) {
            while (i > 0 && heap[(i - 1) / 2] < heap[i]) {
                swap(i, (i - 1) / 2);
                i = (i - 1) / 2;
            }
        }

        public int extractMax() {
            if (size == 0) throw new RuntimeException("Heap is empty");
            int root = heap[0];
            heap[0] = heap[size - 1];
            size--;
            sink(0);
            return root;
        }

        private void sink(int i) {
            while (2 * i + 1 < size) {
                int j = 2 * i + 1;
                if (j + 1 < size && heap[j + 1] > heap[j]) j++;
                if (heap[i] >= heap[j]) break;
                swap(i, j);
                i = j;
            }
        }

        private void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        public int[] sort() {
            int[] result = new int[size];
            int tempSize = size;
            for (int i = 0; i < tempSize; i++) {
                result[i] = extractMax();
            }
            // restore sorted array into heap
            for (int i = 0; i < tempSize; i++) {
                heap[i] = result[i];
            }
            size = tempSize;
            return result;
        }

        public int[] getHeapArray() {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = heap[i];
            return arr;
        }
    }

    // ------------------- Task 3: Assign Tasks -------------------
    // ------------------- Task 3: Assign Tasks -------------------
    public static int[] assignTasks(int[] tasks, int m) {
      MinHeap heap = new MinHeap(m);
      for (int i = 0; i < m; i++) {
          heap.insert(0); // initialize machine loads
      }

      for (int t : tasks) {
          int minLoad = heap.extractMin();
          heap.insert(minLoad + t);
      }

      // Extract all machine loads into an array
      int[] result = new int[m];
      for (int i = 0; i < m; i++) {
          result[i] = heap.extractMin();  // ensures ascending order
      }
      return result;
    }

    // ------------------- Task 4: Top K Largest -------------------
    public static int[] topKLargest(int[] nums, int k) {
        MaxHeap heap = new MaxHeap(nums.length);
        for (int num : nums) {
            heap.insert(num);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.extractMax();
        }
        return result;
    }

    // ------------------- Driver -------------------
    public static void main(String[] args) {
        // Task 1: MinHeap test
        MinHeap minHeap = new MinHeap(10);
        int[] values1 = {5, 3, 8, 1, 2};
        for (int v : values1) minHeap.insert(v);
        int[] minSorted = minHeap.sort();
        System.out.print("MinHeap sorted: ");
        for (int v : minSorted) System.out.print(v + " ");
        System.out.println();

        // Task 2: MaxHeap test
        MaxHeap maxHeap = new MaxHeap(10);
        int[] values2 = {5, 3, 8, 1, 2};
        for (int v : values2) maxHeap.insert(v);
        int[] maxSorted = maxHeap.sort();
        System.out.print("MaxHeap sorted: ");
        for (int v : maxSorted) System.out.print(v + " ");
        System.out.println();

        // Task 3: Assign tasks
        int[] tasks = {2, 4, 7, 1, 6};
        int m = 4;
        int[] loads = assignTasks(tasks, m);
        System.out.print("Task Scheduling: ");
        for (int load : loads) System.out.print(load + " ");
        System.out.println();

        // Task 4: Top K Largest
        int[] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;
        int[] topK = topKLargest(nums, k);
        System.out.print("Top K Largest: ");
        for (int v : topK) System.out.print(v + " ");
        System.out.println();
    }
}