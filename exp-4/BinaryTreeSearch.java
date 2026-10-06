import java.util.Scanner;

public class BinaryTreeSearch {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Input is given in preorder. Enter -1 for a missing child.
    static Node buildTree(Scanner sc) {
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        Node root = new Node(value);
        root.left = buildTree(sc);
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

    // General binary-tree search; the tree does not have to be a BST.
    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        return search(root.left, key) || search(root.right, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Binary Tree Traversal and Search ===");
        System.out.println("Enter values in preorder. Use -1 for a missing node.");
        Node root = buildTree(sc);

        System.out.print("Pre-order: ");
        preOrder(root);

        System.out.print("\nIn-order: ");
        inOrder(root);

        System.out.print("\nPost-order: ");
        postOrder(root);

        System.out.print("\nEnter key to search: ");
        int key = sc.nextInt();

        if (search(root, key)) {
            System.out.println("Key " + key + " found in the binary tree.");
        } else {
            System.out.println("Key " + key + " not found in the binary tree.");
        }

        sc.close();
    }
}
