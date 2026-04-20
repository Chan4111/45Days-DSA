package Day_42;

class IdenticalTree {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to check identical trees
    static boolean isIdentical(Node t1, Node t2) {
        if (t1 == null && t2 == null) return true;

        if (t1 == null || t2 == null) return false;

        return (t1.data == t2.data &&
                isIdentical(t1.left, t2.left) &&
                isIdentical(t1.right, t2.right));
    }

    public static void main(String[] args) {

        /*
            Tree 1           Tree 2
              1                1
             / \              / \
            2   3            2   3
        */

        // Tree 1
        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);

        // Tree 2
        Node t2 = new Node(1);
        t2.left = new Node(2);
        t2.right = new Node(3);

        if (isIdentical(t1, t2))
            System.out.println("Trees are Identical");
        else
            System.out.println("Trees are NOT Identical");
    }
}