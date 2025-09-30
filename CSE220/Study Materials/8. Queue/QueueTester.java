// QueueTester.java - Testing both queue implementations
public class QueueTester {
    public static void main(String[] args) {
        System.out.println("Testing QueueArr:");
        QueueArr qArr = new QueueArr();
        qArr.enqueue(10);
        qArr.enqueue("Hello");
        qArr.enqueue(30.5);
        qArr.printQueue();
        qArr.dequeue();
        System.out.println("-------");
        qArr.printQueue();
        qArr.enqueue(qArr.dequeue());
        System.out.println("-------");
        qArr.printQueue();

        System.out.println("\nTesting QueueLL:");
        QueueLL qLL = new QueueLL();
        qLL.enqueue(10);
        qLL.enqueue("Hello");
        qLL.enqueue(30.5);
        qLL.printQueue();
        qLL.dequeue();
        System.out.println("-------");
        qLL.printQueue();
        qLL.enqueue(qLL.dequeue());
        System.out.println("-------");
        qLL.printQueue();
    }
}