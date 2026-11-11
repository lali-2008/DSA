import java.util.ArrayDeque;
import java.util.Queue;
class QueueStackPushFriendly {
private Queue<Integer> q1 = new ArrayDeque<>();
private Queue<Integer> q2 = new ArrayDeque<>();
// Add element to the stack
void push(int value) {
// Insert value into the empty queue
q2.offer(value);
// Move all elements
while (!q1.isEmpty()) {
q2.offer(q1.poll());
}
// Swap  queues
Queue<Integer> temp = q1;
q1 = q2;
q2 = temp;
}
// Remove and return the element
public int pop() {
if (q1.isEmpty()) {
throw new IllegalStateException("Stack is empty");
}
return q1.poll();
}
// Return the element without removing 
public int peek() {
if (q1.isEmpty()) {
throw new IllegalStateException("Stack is empty");
}
return q1.peek();
}
// Check if the stack isempty
public boolean isEmpty() {
return q1.isEmpty();
}
// Return the size of the  elements
public int size() {
return q1.size();
}
public static void main(String[] args) {
QueueStackPushFriendly stack =
QueueStackPushFriendly();
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println("Top: " + stack.peek());
System.out.println("Removed: " + stack.pop());
System.out.println("Removed: " + stack.pop());
System.out.println("Size: " + stack.size());
}
}
