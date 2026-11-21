
public class ArrayCircularQueue {
    int capacity = 5;
    int[] queue = new int[capacity];
    int front = 0;
    int rear = -1;
    int size = 0;
    // Enqueue operation
    void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println(value + " inserted");
    }
    // Dequeue operation
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed: " + queue[front]);
        front = (front + 1) % capacity;
        size--;
    }
    // Display operation
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.dequeue();
        q.enqueue(50);
        q.enqueue(60);
        q.display();
    }
}
