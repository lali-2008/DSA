
public class SinglyLinkedList {
    //  This is the Node class
    class Node {
        int data;
        Node next;
        Node(int value) {
            data = value;
            next = null;
        }
    }
    Node head = null;
    void insertBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    void insertEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // Delete from beginning
    void deleteBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }
    // Delete from end
    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
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
    // Display operation
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertEnd(5);
        list.insertEnd(3);
        list.insertEnd(2);
        list.insertEnd(7);
        list.display();
        list.insertBeginning(9);
        list.display();
        list.deleteBeginning();
        list.display();
        list.deleteEnd();
        list.display();
        list.search(3);
    }
}
