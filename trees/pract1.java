
    
  class node{
        int data;
        node left, right;

        node(int d){
            data = d;
            left = null;
            right = null;
        }
        

    }
    public class pract1{
        node root;
       pract1(){
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
    public static void main(String[] args) {
        pract1 tree = new pract1();
        tree.root = new node(78);
        tree.root.left = new node(45);
        tree.root.right = new node(32);
        tree.root.left.left = new node(12);
        tree.root.left.right = new node(100);
        tree.root.right.left = new node(7);
        tree.root.right.right = new node(90);
        tree.root.right.left.left= new node(20);
       tree.preorder(tree.root); 
       System.out.println("");
       tree.inorder(tree.root);     

    }
}