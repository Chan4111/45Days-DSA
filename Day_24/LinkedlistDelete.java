package Day_24;

    class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

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

    // Delete at Beginning
    public void deleteAtBeginning() {
        if (head == null) return;
        head = head.next;
    }

    // Delete at End
    public void deleteAtEnd() {
        if (head == null) return;

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

    // Delete by Value
    public void deleteByValue(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class LinkedlistDelete {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        System.out.println("Delete at Beginning");
        list.deleteAtBeginning();
        list.display();

        System.out.println("Delete at End");
        list.deleteAtEnd();
        list.display();

        System.out.println("Delete by Value (20)");
        list.deleteByValue(20);
        list.display();
    }
}
