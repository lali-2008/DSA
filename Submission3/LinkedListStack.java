public class LinkedListStack {
// Node class
class Node {
int data;
Node next;
Node(int value) {
data = value;
next = null;
}
}
Node top = null;
// Push operation
void push(int value) {
Node newNode = new Node(value);
newNode.next = top;
top = newNode;
System.out.println(value + " pushed");
}
// Pop operation is done here
void pop() {
if (top == null) {
System.out.println("Stack is empty");
return;
}
System.out.println("Popped: " + top.data);
top = top.next;
}
// Peek operation is done here
void peek() {
if (top == null) {
System.out.println("Stack is empty");
return;
}
System.out.println("Top element: " + top.data);
}
void display() {
if (top == null) {
System.out.println("Stack is empty");
return;
}
Node temp = top;
while (temp != null) {
System.out.print(temp.data + " -> ");
temp = temp.next;
}
System.out.println("null");
}
public static void main(String[] args) {
LinkedListStack stack = new LinkedListStack();
stack.push(5);
stack.push(3);
stack.push(2);
stack.push(7);
stack.display();
stack.peek();
stack.pop();
stack.display();
}
}