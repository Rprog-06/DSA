 class node{
        int data;
        node left, right;

        node(int d){
            data = d;
            left = null;
            right = null;
        }
        

    }
    public class pract3{
        node root;
       pract3(){
        root=null;
       }
    void preorder(node Node){
         
        if(Node==null){
            return;
        }
        else
        {
         System.out.print(Node.data + "->");
         preorder(Node.left);
         preorder(Node.right);   
        } 
    }
    void inorder(node Node){
        if(Node==null){
            return;
        }
        else{
             inorder(Node.left);
            System.out.print(Node.data+ "->");
           
            inorder(Node.right);    

        }
    }
    public static node buildbst(int[] arr) {
        return build(arr, 0, arr.length - 1);
    }
    public static node build(int[] arr,int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        node newnode = new node(arr[mid]);
        newnode.left = build(arr, left, mid - 1);
       newnode.right = build(arr, mid + 1, right);
        return newnode;}
    public void KthSmallest(node root, int k, int[] count) {
        if (root == null || count[0] >= k) return;
        // Traverse the left subtree
        KthSmallest(root.left, k, count);
        // Increment the count of visited nodes
        count[0]++;
        // If count matches k, print the current node's data
        if (count[0] == k) {
            System.out.println("The " + k + "th smallest element is: " + root.data);
            return;
        }
        // Traverse the right subtree
        KthSmallest(root.right, k, count);
    }
       public static void main(String[] args) {
        pract3 tree = new pract3();
        tree.root = new node(78);
        tree.root.left = new node(45);
        tree.root.right = new node(32);
        tree.root.left.left = new node(12);
        tree.root.left.right = new node(100);
        tree.root.right.left = new node(7);
        tree.root.right.right = new node(90);
        tree.root.right.left.left= new node(20);
     //  tree.preorder(tree.root); 
       System.out.println("");
       tree.inorder(tree.root); 
       // The old implementation has been moved to BinarySearchTree.java and improved.
       // The following code demonstrates how to use the new, refactored class.

       // 1. Build BST from a sorted array
       int[] arr = {12, 20, 32, 45, 78, 90, 100};
     int k = 1;
       node bstRoot = buildbst(arr);
       pract3 bstTree = new pract3();
       bstTree.root = bstRoot;

       System.out.println("\nInorder traversal of the BST:");
       bstTree.inorder(bstTree.root);
       System.out.println("\nFinding the " + k + "rd smallest element:");
       int[] count = {0};
       bstTree.KthSmallest(bstTree.root, k, count);

       int kInvalid = 10;
       System.out.println("\nFinding the " + kInvalid + "th smallest element:");
       count[0] = 0; // Reset count for invalid case
       bstTree.KthSmallest(bstTree.root, kInvalid, count);
      
            

        
      


    }
    }