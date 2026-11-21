
public class DoublyLinkedList {
    // Node class
    class Node {
        int data;
        Node prev;
        Node next;
        Node(int value) {
            data = value;
            prev = null;
            next = null;
        }
    }
    Node head = null;
    Node tail = null;
    // Insert at beginning
    void insertBeginning(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // Insert at end
    void insertEnd(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    // Delete from beginning
    void deleteBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
    // Delete from end
    void deleteEnd() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }
    // Search operation
    void search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Value found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found");
    }
    // Display forward
    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Display backward
    void displayBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
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
        list.search(3);
    }
}
