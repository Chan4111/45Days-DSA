package Day_26;

public class DetectLoop {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at end
    public void insert(int data) {
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

    // Print list (safe print - stops if loop)
    public void printList() {
        Node temp = head;
        int count = 0;

        while (temp != null && count < 10) { // safety limit
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }
        System.out.println("NULL");
    }

    // Detect Loop (Floyd Algorithm)
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Create Loop (for testing)
    public void createLoop() {
        if (head == null) return;

        Node temp = head;
        Node thirdNode = null;
        int count = 1;

        while (temp.next != null) {
            if (count == 3) {
                thirdNode = temp;
            }
            temp = temp.next;
            count++;
        }

        temp.next = thirdNode; // last node → 3rd node
    }

    public static void main(String[] args) {
        DetectLoop list = new DetectLoop();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Linked List:");
        list.printList();

        // Create loop
        list.createLoop();

        // Detect loop
        if (list.hasLoop()) {
            System.out.println("Loop Detected");
        } else {
            System.out.println("No Loop ");
        }
    }
}