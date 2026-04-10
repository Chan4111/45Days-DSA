package Day_33;

class CircularQueue {
    int front, rear, size;
    int arr[];

    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue
    void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) { // First element
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = x;
        System.out.println(x + " inserted");
    }

    // Dequeue
    void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(arr[front] + " deleted");

        if (front == rear) { // Only one element
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(60);
        q.enqueue(70);

        q.display();
    }
}


