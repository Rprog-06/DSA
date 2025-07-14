

class Node{
    int data;
    Node left,right;
    Node(int value){
       data=value;
       left=null;
       right=null;
    }
}
public class pract4{
  //Creating BST and finding Lowest Common Ancestor
    Node root;
    pract4(){
        root=null;
    }
    void insert(int value){
        root=insertRec(root, value);
    }
    Node insertRec(Node root, int value){
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(value<root.data){
            root.left=insertRec(root.left, value);
        }else if(value>root.data){
            root.right=insertRec(root.right, value);
        }
        return root;
    }
    Node findLCA(Node root, int n1, int n2){
        if(root==null) return null;
        if(root.data>n1 && root.data>n2){
            return findLCA(root.left, n1, n2);
        }
        if(root.data<n1 && root.data<n2){
            return findLCA(root.right, n1, n2);
        }
        return root;
    }
    public static void main(String[] args) {
        pract4 tree = new pract4();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);

        int n1 = 25, n2 = 35;
        Node lca = tree.findLCA(tree.root, n1, n2);
        if(lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {
            System.out.println("LCA not found.");
        }
    }
}