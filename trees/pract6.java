//given the root of BST and two integers low and high find the sum of all values in the range
import java.util.*;
class Node {

    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class pract6{
 Node root;
int sum=0;
    pract6() {
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
    void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);

    }
    void sum(Node root,int low, int high) {
        if(root == null) {
           return;
        }
       
        
       
        Scanner sc=new Scanner(System.in);
       
       
            if(root.data>=6 && root.data<=15){
              sum+=root.data;   
            

        }
           sum(root.left, low, high);
        sum(root.right, low, high);
     

    }
    public static void main(String[] args) {
        pract6 q=new pract6();
        q.insert(15);
        q.insert(10);
        q.insert(5);
        q.insert(7);
        q.insert(12);
      
        q.insert(6);
        q.insert(8);
       
        q.inorder(q.root);
        q.sum(q.root, 6, 15);
        System.out.println("The sum is"+q.sum);      

    
    }
}
