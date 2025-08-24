class Node{
   static Node root; 
   int data;
   Node left=null;
   Node right=null;
   Node(int data){
    this.data=data;
    this.left=left;
    this.right=right;

   }

}
public class pract66{
    void display(Node root){
       if(root==null) return;
       System.out.print(root.data + "->");
       display(root.left);
       display(root.right);
      
       


    }
    void leafpath(Node root){
        if(root != null){
            System.out.print(root.data + "->");
            display(root.left);
        }
        System.out.println();
         if(root != null){
            System.out.print(root.data + "->");
            display(root.right);
        }
    }
    public static void main(String[] args){
        pract66 p=new pract66();
        Node a=new Node(1);
        a.left=new Node(2);
        a.left.right=new Node(5);
        a.right=new Node(3);
       // p.display(a);
        p.leafpath(a);


    }
}