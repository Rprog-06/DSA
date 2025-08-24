
import java.util.*;
import jdk.jfr.Name;

class node {

    int data;
     node next;

    node(int data) {
        this.data = data;
        this.next = next;
    }
}

public class xyz {

    static node head;

    static void insertAthead(int data) {
        node newnode = new node(data);
      
        
       
         
            newnode.next = head;
            head = newnode;
        
        

    }

    static void display() {
       
        node current=head;
        while (current != null) {
            System.out.print(current.data + "->");
            current=current.next;
           
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();
            insertAthead(arr[i]);

        }
        display();
       

        

    }
}
