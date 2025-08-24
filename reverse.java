import java.util.*;
class node{
    int data;
    node next;
    node prev;
    node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class reverse{
   

    public static node reverse(node root){
         node current=root;
        node next=null;
        node prev=null;
     while(current != null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;



     }
     return prev;
    }
    public static node insertAtEnd(node head, int data) {
        node newNode = new node(data);
        if (head == null) {
            return newNode;
        }
        node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        return head;
    }
    public static void display(node head){
        node current=head;
        while(current != null){
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node root=null;
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            root=insertAtEnd(root, arr[i]);
        }
        display(root);
        root=reverse(root);
        display(root);

        
    }
    
}
