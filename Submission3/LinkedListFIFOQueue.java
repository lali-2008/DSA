public class LinkedListFIFOQueue {
// Node class
class Node {
int data;
Node next;
Node(int value) {
data = value;
next = null;
}
}
Node front = null;
Node rear = null;
// Enqueue operation
void enqueue(int value) {
Node newNode = new Node(value);
if (rear == null) {
front = rear = newNode;
} else {
rear.next = newNode;
rear = newNode;
}
System.out.println(value + " inserted");
}
// Dequeue operation
void dequeue() {
if (front == null) {
System.out.println("Queue is empty");
return;
}
System.out.println("Removed: " + front.data);
front = front.next;
if (front == null) {
rear = null;
}
}
// Peek operation
void peek() {
if (front == null) {
System.out.println("Queue is empty");
return;
}
System.out.println("Front element: " + front.data);
}
// Display operation
void display() {
if (front == null) {
System.out.println("Queue is empty");
return;
}
Node temp = front;
while (temp != null) {
System.out.print(temp.data + " -> ");
temp = temp.next;
}
System.out.println("null");
}
public static void main(String[] args) {
LinkedListFIFOQueue queue =
new LinkedListFIFOQueue();
queue.enqueue(5);
queue.enqueue(3);
queue.enqueue(2);
queue.enqueue(7);
queue.display();
queue.peek();
queue.dequeue();
queue.display();
}
}