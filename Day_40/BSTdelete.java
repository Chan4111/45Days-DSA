package Day_40;



public class BSTdelete {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // Insert
    Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    // Inorder Traversal (Sorted Output)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Find Min (Inorder Successor)
    Node minValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete Function
    Node delete(Node root, int key) {
        if (root == null) return root;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } 
        else if (key > root.data) {
            root.right = delete(root.right, key);
        } 
        else {
            // Case 1 & 2
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: 2 children
            Node successor = minValue(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    public static void main(String[] args) {
        BSTdelete tree = new BSTdelete();

        // Insert
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.print("Before Deletion: ");
        tree.inorder(tree.root);

        // Delete
        tree.root = tree.delete(tree.root, 50);

        System.out.print("\nAfter Deletion: ");
        tree.inorder(tree.root);
    }
}
