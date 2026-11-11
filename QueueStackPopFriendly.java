import java.util.ArrayDeque;
import java.util.Queue;
class QueueStackPopFriendly {
private Queue<Integer> q1 = new ArrayDeque<>();
private Queue<Integer> q2 = new ArrayDeque<>();
// Add element to the stack
void push(int value) {
q1.offer(value);
}
// Remove element
public int pop() {
if (q1.isEmpty()) {
throw new IllegalStateException("Stack is empty");
}
// Move all elements except  one
while (q1.size() > 1) {
q2.offer(q1.poll());
}
int removed = q1.poll();
// Swap queues
Queue<Integer> temp = q1;
q1 = q2;
q2 = temp;
return removed;
}
// Return  the element without removing 
public int peek() {
if (q1.isEmpty()) {
throw new IllegalStateException("Stack is empty");
}
while (q1.size() > 1) {
q2.offer(q1.poll());
}
int top = q1.peek();
// Take back the front element which is being removed
q2.offer(q1.poll());
Queue<Integer> temp = q1;
q1 = q2;
q2 = temp;
return top;
}
public boolean isEmpty() {
return q1.isEmpty();
}
public static void main(String[] args) {
QueueStackPopFriendly stack =
QueueStackPopFriendly();
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println("Top: " + stack.peek());
System.out.println("Removed: " + stack.pop());
System.out.println("Removed: " + stack.pop());
System.out.println("Empty: " + stack.isEmpty());
}
}