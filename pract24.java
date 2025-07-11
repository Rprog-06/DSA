
import java.util.Scanner;

//Creating a linked list in  nested class and inserting at End
public class pract24 {
    static Node head;

    // Nested static Node class
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at the beginning
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Display the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void count(){
        int count=0;
        Node current=head;
        while(current !=null){
         count++;
         current=current.next;
        }
        System.out.println("NUmber of nodes :"+count);

    }
    public void search(int target){
        Node current=head;
        while(current !=null){
              if(current.data==target){

                System.out.println("Element found");
                return;
              }
             
               
             
            

              current=current.next;
        }
         System.out.println("Not found");
    }
    public void insertAtmiddle(int data,int n){
        Node newnode=new Node(data);
        Node current=head;


        while(current.data!=n){
                current=current.next;
        }
        newnode.next=current.next;
        current.next=newnode;

    }
    

    // Main to test functionality
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pract24 list = new pract24();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBegin(5);
      list.insertAtmiddle(80, 5);
        list.insertAtEnd(30);

        list.display();
        list.count(); 
        System.out.print("Enter target to seracg");
        int target=sc.nextInt();
        list.search(target);
        // Output: 5 -> 10 -> 20 -> 30 -> null
    }
}
