package Day_29;

class StackArray {
    int top;
    int size;
    int arr[];

    StackArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push
    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
        System.out.println(x + " pushed into stack");
    }

    // Pop
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // isEmpty
    boolean isEmpty() {
        return top == -1;
    }

    // Display Stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Try overflow
        stack.push(60);

        // Display
        stack.display();

        // Peek
        System.out.println("Top element: " + stack.peek());

        // Pop
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Display after pop
        stack.display();

        // Check empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}