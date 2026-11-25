public class CircularDoublyLinkedList {
// Keeps a node
class Node {
int data;
Node previous;
Node next;
Node(int value) {
data = value;
}
}
Node head = null;
Node tail = null;
// Add  node to the front
void insertBeginning(int value) {
Node newNode = new Node(value);
if (head == null) {
head = tail = newNode;
head.next = head;
head.previous = head;
return;
}
newNode.next = head;
newNode.previous = tail;
head.previous = newNode;
tail.next = newNode;
head = newNode;
}
// Add node to the back
void insertEnd(int value) {
Node newNode = new Node(value);
if (head == null) {
head = tail = newNode;
head.next = head;
head.previous = head;
return;
}
newNode.previous = tail;
newNode.next = head;
tail.next = newNode;
head.previous = newNode;
tail = newNode;
}
// Delete the first node
void deleteBeginning() {
if (head == null) {
System.out.println("The list is empty");
return;
}
if (head == tail) {
head = tail = null;
return;
}
head = head.next;
head.previous = tail;
tail.next = head;
}
// Delete the last node
void deleteEnd() {
if (head == null) {
System.out.println("The list is empty");
return;
}
if (head == tail) {
head = tail = null;
return;
}
tail = tail.previous;
tail.next = head;
head.previous = tail;
}
// Display the whole  list 
displayForward() {
if (head == null) {
System.out.println("The list is empty");
return;
}
Node temp = head;
do {
System.out.print(temp.data + " <-> ");
temp = temp.next;
} while (temp != head);
System.out.println("(Head)");
//  Display the list from tail to head
displayBackward() {
if (tail == null) {
System.out.println("The list is empty");
return;
}
Node temp = tail;
do {
System.out.print(temp.data + " <-> ");
temp = temp.previous;
} while (temp != tail);
System.out.println("(Tail)");
}
public static void main(String[] args) {
CircularDoublyLinkedList list =
CircularDoublyLinkedList();
list.insertEnd(5);
list.insertEnd(3);
list.insertEnd(2);
list.insertEnd(7);
list.displayForward();
list.insertBeginning(9);
list.displayForward();
list.deleteBeginning();
list.displayForward();
list.deleteEnd();
list.displayForward();
list.displayBackward();
}
}