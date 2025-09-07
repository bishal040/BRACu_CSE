public class Lab8Submit {
  static class minHeap {
    public int size;
    public int[] minHeap;
    public int capacity;
    public minHeap(int capacity){
        this.capacity = capacity;
      this.size = 0;
      this.minHeap = new int[capacity];
    }
    public void insert(int value){
      if (size < capacity) {
        minHeap[size] = value;
        swim(size);
        size++;
      }
    }
      public int extractMin(){
        if (size == 0){
          return Integer.MIN_VALUE;
        } 
        int result = minHeap[0];
        minHeap[0] = minHeap[--size];
        sink(0);
      return result;
      }

      public void swim(int childIdx){
        while (childIdx > 0){
          int parentIdx = (childIdx - 1) / 2;
          if (minHeap[childIdx] < minHeap[parentIdx]){
            int temp = minHeap[parentIdx];
            minHeap[parentIdx] = minHeap[childIdx];
            minHeap[childIdx] = temp;
            childIdx = parentIdx;
          } 
          else{
            break;
          }
          }
      }
      public void sink(int parentIdx){
        while (true){
          int leftChildIdx = 2 * parentIdx + 1;
          int rightChildIdx = 2 * parentIdx + 2;
          int smallest = parentIdx;

          if (leftChildIdx < size && minHeap[leftChildIdx] < minHeap[smallest]){
            smallest = leftChildIdx;
          }
          if (rightChildIdx < size && minHeap[rightChildIdx] < minHeap[smallest]){
            smallest = rightChildIdx;
          }
          if (smallest == parentIdx){
            break;
          }
          int temp = minHeap[parentIdx];
          minHeap[parentIdx] = minHeap[smallest];
          minHeap[smallest] = temp;
          parentIdx = smallest;
          }
      }
  }
  static class maxHeap{
  public int size;
  public int[] heap;
  public int capacity;
  public maxHeap(int capacity){
      this.capacity = capacity;
      this.size = 0;
      this.heap = new int[capacity];
  }
  public void insert(int value){
    if (size < capacity) {
        heap[size] = value;
        swim(size);
        size++;
    }
  }
  public int extractMax(){
    if (size == 0) return Integer.MIN_VALUE;
    int result = heap[0];
    heap[0] = heap[--size];
    sink(0);
    return result;
  }
  public void swim(int childIdx){
    while (childIdx > 0){
      int parentIdx = (childIdx - 1) / 2;
      if (heap[childIdx] > heap[parentIdx]){
        int temp = heap[parentIdx];
        heap[parentIdx] = heap[childIdx];
        heap[childIdx] = temp;
        childIdx = parentIdx;
      } else{
          break;
      }
    }
  }
  public void sink(int parentIdx){
    while (true){
      int leftChildIdx = 2 * parentIdx + 1;
      int rightChildIdx = 2 * parentIdx + 2;
      int largest = parentIdx;
        if (leftChildIdx < size && heap[leftChildIdx] > heap[largest]){
            largest = leftChildIdx;
        }
        if (rightChildIdx < size && heap[rightChildIdx] > heap[largest]){
            largest = rightChildIdx;
        }
        if (largest == parentIdx){
            break;
        }
          int temp = heap[parentIdx];
          heap[parentIdx] = heap[largest];
          heap[largest] = temp;
          parentIdx = largest;
      }
    }
  }
  public static int[] machine_min_time(int[] task, int m){
    minHeap heap = new minHeap(m);
    for(int i = 0; i<= m; i++){
      heap.insert(0);
    }
    for(int val: task){
      heap.insert(heap.extractMin()+ val);
    }
    int[] result = new int[m];
    for(int i=0; i<result.length; i++){
      result[i] = heap.extractMin();
    }
    return result;
  }

  public static int[] kth_largest(int[] arr, int k){
    maxHeap heap = new maxHeap(arr.length);
    for(int val : arr){
      heap.insert(val);
    }
    int[] result = new int[k];
    for(int i=0; i<result.length; i++){
      result[i] = heap.extractMax();
    }
    return result;

  }

  public static void printArray(int[] arr){
    System.out.print("[");
    for(int i =0; i<arr.length; i++){
      if(i!=arr.length-1){
        System.out.print(arr[i] + ", ");
      }
      else{
        System.out.print(arr[i]);
      }
    }
    System.out.println("]");
  }
  public static void main(String[] args) {
    //task3
    int[] tasks = {2, 4, 7, 1, 6};
    int m = 4;
    int[] task3Result = machine_min_time(tasks, m);
    printArray(task3Result);
    //task4
    int[] nums ={4, 10, 2, 8, 6, 7};
    int k = 3;
    int[] task4Result = kth_largest(nums,k);
    printArray(task4Result);
  }
}