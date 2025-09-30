// QueueArr.java - Queue implementation using an array
import java.util.Arrays;

public class QueueArr {
    private Object[] queue;
    private int front, back;
    
    public QueueArr() {
        queue = new Object[5];
        front = 0;
        back = 0;
    }
    
    public void enqueue(Object data) {
        if (queue[back] != null) {
            System.out.println("At Full Capacity. Cannot enqueue!");
        } else {
            queue[back] = data;
            back = (back + 1) % queue.length;
        }
    }
    
    public Object dequeue() {
        if (queue[front] == null) {
            System.out.println("Queue is Empty. Cannot dequeue!");
            return null;
        } else {
            Object removed = queue[front];
            queue[front] = null;
            front = (front + 1) % queue.length;
            return removed;
        }
    }
    
    public boolean isEmpty() {
        return queue[front] == null;
    }
    
    public void printQueue() {
        int i = front;
        if (queue[i] != null) {
            System.out.print(queue[i] + " | ");
            i = (i + 1) % queue.length;
        }
        while (i != back) {
            if (queue[i] != null) {
                System.out.print(queue[i] + " | ");
            }
            i = (i + 1) % queue.length;
        }
        System.out.println();
    }
}