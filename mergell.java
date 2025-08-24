import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class mergell {

    // Function to print a doubly linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Function to concatenate two doubly linked lists
    public static Node concatenate(Node fhead, Node shead) {
        if (fhead == null) return shead;
        if (shead == null) return fhead;

        // Traverse to the tail of first list
        Node ftail = fhead;
        while (ftail.next != null) {
            ftail = ftail.next;
        }

        // Connect lists
        ftail.next = shead;
        shead.prev = ftail;

        return fhead;  // head of merged list
    }
    public static void sort(Node head){
        //Using bubble sort
        for (Node i = head; i != null; i = i.next) {
            for (Node j = head; j != null && j.next != null; j = j.next) {
                if (j.data > j.next.data) {
                    // Swap data
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();

        }
        int arri[]=new int[3];
        for (int i = 0; i < 3; i++) {
            arri[i]=sc.nextInt();
        }
        // First linked list: 1 <-> 2 <-> 3
        Node fhead = new Node(arr[0]);
        fhead.next = new Node(arr[1]);
       
        fhead.next.next = new Node(arr[2]);
       

        // Second linked list: 4 <-> 5 <-> 6
        Node shead = new Node(arri[0]);
        shead.next = new Node(arri[1]);
       
        shead.next.next = new Node(arri[2]);
       

        System.out.println("First List:");
        printList(fhead);

        System.out.println("Second List:");
        printList(shead);

        // Concatenate
        Node merged = concatenate(fhead, shead);
       
        System.out.println("Concatenated List:");
        printList(merged);
         sort(merged);
         System.out.println("Sorted Merged List:");
         printList(merged);
    }
}
