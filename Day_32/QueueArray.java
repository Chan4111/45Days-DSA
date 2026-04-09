package Day_32;

class QueueArray {
    int front, rear, size;
    int arr[];

    QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    // Enqueue
    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear] = x;
        System.out.println(x + " inserted");
    }

    // Dequeue
    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = arr[front++];
        System.out.println(val + " removed");
        return val;
    }

    // Peek
    int peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // Display Queue
    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}


    