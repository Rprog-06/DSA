import java.util.Optional;
import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    /**
     * Builds a balanced Binary Search Tree from a sorted array.
     * @param arr The sorted array of integers.
     * @return The root node of the newly constructed BST.
     */
    public static Node buildbst(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        return build(arr, 0, arr.length - 1);
    }

    private static Node build(int[] arr, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2; // Avoid potential overflow
        Node newNode = new Node(arr[mid]);
        newNode.left = build(arr, left, mid - 1);
        newNode.right = build(arr, mid + 1, right);
        return newNode;
    }

    /**
     * Finds the Kth smallest element in the BST using an iterative approach.
     * This is the recommended approach as it avoids recursion depth issues.
     *
     * @param k The position of the element to find (1-based).
     * @return An Optional containing the Kth smallest element, or an empty Optional if not found.
     */
    public Optional<Integer> kthSmallest(int k) {
        if (k <= 0 || root == null) {
            return Optional.empty();
        }

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            k--;

            if (k == 0) {
                return Optional.of(current.data);
            }

            current = current.right;
        }
        return Optional.empty(); // k is larger than the number of nodes
    }

    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " -> ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        // Build BST from a sorted array
        int[] arr = {12, 20, 32, 45, 78, 90, 100};
        Node bstRoot = buildbst(arr);

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = bstRoot;

        System.out.println("Inorder traversal of the BST:");
        tree.inorder(tree.root);
        System.out.println("\n");

        int k = 3;
        System.out.println("Finding the " + k + "rd smallest element (Iterative):");
        tree.kthSmallest(k)
            .ifPresentOrElse(
                value -> System.out.println("The " + k + "rd smallest element is: " + value),
                () -> System.out.println("The " + k + "rd smallest element was not found (invalid k or empty tree).")
            );

        int kInvalid = 10;
        System.out.println("\nFinding the " + kInvalid + "th smallest element (Iterative):");
        tree.kthSmallest(kInvalid)
            .ifPresentOrElse(
                value -> System.out.println("The " + kInvalid + "th smallest element is: " + value),
                () -> System.out.println("The " + kInvalid + "th smallest element was not found (k is out of bounds).")
            );
    }
}