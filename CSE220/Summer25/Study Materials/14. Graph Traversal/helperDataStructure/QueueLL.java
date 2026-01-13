package helperDataStructure;

// QueueLL.java - Queue implementation using Doubly Linked List
public class QueueLL {
    private DNode head;

    public QueueLL() {
        head = new DNode(null); // Dummy Head
        head.next = head.prev = head;
    }

    public void printQueue() {
        DNode n = head.next;
        while (n != head) {
            System.out.print(n.elem + " <-> ");
            n = n.next;
        }
        System.out.println();
    }

    public void enqueue(Object data) {
        DNode newNode = new DNode(data);
        DNode lastNode = head.prev;
        newNode.prev = lastNode;
        newNode.next = head;
        lastNode.next = head.prev = newNode;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
            return null;
        }
        DNode rmNode = head.next;
        DNode before = rmNode.prev;
        DNode after = rmNode.next;
        before.next = after;
        after.prev = before;
        return rmNode.elem;
    }

    public boolean isEmpty() {
        return head == head.next && head == head.prev;
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue("Hello");
        q.enqueue(q.dequeue());
        q.printQueue();

        q = new QueueLL();
        System.out.println("------------------");
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println("------------------");
        q.enqueue(10);
        q.enqueue(20.5);
        q.enqueue("Test");
        q.enqueue(true);
        q.printQueue();
        System.out.println("------------------");
        System.out.println(q.dequeue() + " dequeued!!");
        q.printQueue();
        System.out.println("------------------");
        q.dequeue();
        q.enqueue(50);
        q.enqueue('C');
        q.printQueue();
        System.out.println("------------------");
    }
}