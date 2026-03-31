package Day_23;

public class LinkedListInsert {

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at Beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at Position
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);

        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for(int i = 1; i < position - 1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListInsert list = new LinkedListInsert();

        System.out.println("The Give List InsertAt Beginning Is:");
        list.insertAtBeginning(10);
        list.display();

        System.out.println("The Give List InsertAt End Is:");
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        System.out.println("The Give List InsertAt Position Is:");
        list.insertAtPosition(25, 3);
        list.display();
    }
}
