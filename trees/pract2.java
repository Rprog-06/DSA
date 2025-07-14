// Array input to create a tree
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class pract2{

    // Function to convert array to tree
    public static Node insertLevelOrder(int[] arr, int i) {
        if (i >= arr.length) return null;

        Node root = new Node(arr[i]);
        root.left = insertLevelOrder(arr, 2 * i + 1);
        root.right = insertLevelOrder(arr, 2 * i + 2);

        return root;
    }

    // Function to print tree in preorder
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Node root = insertLevelOrder(arr, 0);

        System.out.println("Preorder traversal of tree:");
        preorder(root);
    }
}
