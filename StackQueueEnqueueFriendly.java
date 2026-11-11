import java.util.ArrayDeque;
import java.util.Deque;
public class StackQueueEnqueueFriendly {
    private Deque<Integer> stack1 = new ArrayDeque<>();
    private Deque<Integer> stack2 = new ArrayDeque<>();
    // Add an element to the rear of the queue
    public void enqueue(int value) {
        stack1.push(value);
    }
    // Transfer elements
    private void transferIfNeeded() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
    // Remove and return the front element
    public int dequeue() {
        transferIfNeeded();
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return stack2.pop();
    }
    public int peek() {
        transferIfNeeded();
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return stack2.peek();
    }
    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    // Return the number of elements
    public int size() {
        return stack1.size() + stack2.size();
    }
    public static void main(String[] args) {
        StackQueueEnqueueFriendly queue =
                new StackQueueEnqueueFriendly();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front: " + queue.peek());
        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());
        queue.enqueue(40);
        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
    }
}
