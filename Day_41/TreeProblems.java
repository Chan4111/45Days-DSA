package Day_41;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeProblems {

    // Build Tree using Level Order Input
    static Node buildTree(Scanner sc) {
        System.out.print("Enter root value: ");
        int val = sc.nextInt();

        if (val == -1) return null;

        Node root = new Node(val);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            System.out.print("Enter left of " + curr.data + ": ");
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                curr.left = new Node(leftVal);
                q.add(curr.left);
            }

            System.out.print("Enter right of " + curr.data + ": ");
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                curr.right = new Node(rightVal);
                q.add(curr.right);
            }
        }

        return root;
    }

    // Height
    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Count Nodes
    static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Sum of Nodes
    static int sum(Node root) {
        if (root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    // Max Element
    static int maxValue(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maxValue(root.left), maxValue(root.right)));
    }

    // Check Balanced
    static int checkHeight(Node root) {
        if (root == null) return 0;

        int left = checkHeight(root.left);
        int right = checkHeight(root.right);

        if (left == -1 || right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }

    static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    // Diameter
    static int diameter(Node root) {
        if (root == null) return 0;

        int leftH = height(root.left);
        int rightH = height(root.right);

        int leftD = diameter(root.left);
        int rightD = diameter(root.right);

        return Math.max(leftH + rightH, Math.max(leftD, rightD));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = buildTree(sc);

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Height: " + height(root));
        System.out.println("Total Nodes: " + countNodes(root));
        System.out.println("Sum of Nodes: " + sum(root));
        System.out.println("Max Element: " + maxValue(root));
        System.out.println("Is Balanced: " + isBalanced(root));
        System.out.println("Diameter: " + diameter(root));
    }
}