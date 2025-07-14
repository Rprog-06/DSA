
class Node {

    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class pract5 {

    Node root;

    pract5() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        } else if (value < root.data) {
            root.left = insertRec(root.left, value);

        } else {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    Node LCA(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        } else if (root.data > n1 && root.data > n2) {
            return LCA(root.left, n1, n2);
        } else if (root.data < n1 && root.data < n2) {
            return LCA(root.right, n1, n2);
        }
        return root;

    }

    public static void main(String[] args) {
        pract5 p = new pract5();
        p.insert(20);
        p.insert(10);
        p.insert(30);
        p.insert(25);
        p.insert(35);
        p.insert(5);
        p.insert(15);
        int n1=5;
        int n2=10;
        Node abc=p.LCA(p.root, n1, n2);
        System.out.println(abc.data);

    }
}
