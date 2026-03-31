package Day_22;

public class ReverseLinklist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // Insert at Beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);

            newNode.next = head; // link new node to current head
            head = newNode; // update head
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

        // Reverse Linklist
        public void reverseList() {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node next = curr.next; // store next
                curr.next = prev; // reverse link
                prev = curr; // move prev
                curr = next; // move curr
            }

            head = prev; // update head
        }

        // Print List
        public void printList() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);
    list.insertAtEnd(40);

    System.out.print("Original: ");
    list.printList();

    list.reverseList();

    System.out.print("Reversed: ");
    list.printList();
   }
}
