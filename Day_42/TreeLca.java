package Day_42;

class TreeLca {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // LCA Function
    static Node LCA(Node root, int n1, int n2) {
        if (root == null) return null;

        if (root.data == n1 || root.data == n2)
            return root;

        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }

    public static void main(String[] args) {

        /*
                1
              /   \
             2     3
            / \   / \
           4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 5;

        Node lca = LCA(root, n1, n2);

        if (lca != null)
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
        else
            System.out.println("LCA not found");
    }
}