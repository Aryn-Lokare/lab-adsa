import java.util.Scanner;

public class BinaryTreeTraversals {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Input is given in preorder. Enter -1 for a missing child.
    static Node buildTree(Scanner sc) {
        while(!sc.hasNextInt()){
            System.out.println("Invalid input. Please enter an integer.");
            sc.next();
        }

        System.out.print("Enter node value (-1 for no node): ");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        Node root = new Node(value);

        System.out.println("Enter left child of " + value);
        root.left = buildTree(sc);

        System.out.println("Enter right child of " + value);
        root.right = buildTree(sc);

        return root;
    }

    static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Binary Tree Construction ===");
        Node root = buildTree(sc);

        System.out.print("\nPre-order: ");
        preOrder(root);

        System.out.print("\nIn-order: ");
        inOrder(root);

        System.out.print("\nPost-order: ");
        postOrder(root);

        System.out.println();
        sc.close();
    }
}

