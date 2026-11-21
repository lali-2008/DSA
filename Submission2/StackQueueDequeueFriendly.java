import java.util.Stack;
public class StackQueueDequeueFriendly {
Stack<Integer> mainStack = Stack<>();
Stack<Integer> tempStack = new Stack<>();
// Add to the queue
void enqueue(int value) {
while (!mainStack.isEmpty()) {
tempStack.push(mainStack.pop());
}
mainStack.push(value);
while (!tempStack.isEmpty()) {
mainStack.push(tempStack.pop());
}
System.out.println(value + " inserted");
}
// Take out of the queue
dequeue() {
if (mainStack.isEmpty()) {
System.out.println("Queue is empty");
return;
}
System.out.println("Removed: " + mainStack.pop());
}
// Show what is in the queue
display() {
if (mainStack.isEmpty()) {
System.out.println("Queue is empty");
return;
}
System.out.println("Queue elements: " + mainStack);
}
public static void main(String[] args) {
StackQueueDequeueFriendly q =
new );
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.display();
q.dequeue();
q.display();
}
}