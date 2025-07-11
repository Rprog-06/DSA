




public class pract26 {

    //Double linked list implementation
    static node head;

    private static class node {

        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    void insertAtbegin(int data) {

        //insert at the beginning of the list
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }

    }

    void insertE(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
            newnode.prev = current;
            newnode.next = null;

        }

    }
    void inserAtMiddle(int data,int n){
        node newnode=new node(data);
        node current=head;
        if(head==null){
            head=newnode;
        }
        else{
           while(current.data != n  ){
            current=current.next;
           }
           newnode.next=current.next;
           current.next=newnode;
           newnode.prev=current;
           current.next.next.prev=newnode;


        }

    }
    void deleteAtbegin(){
        head=head.next;
        head.prev=null;

        
    }
    void deleteend(){
      node current=head;
      while(current.next.next != null){
        current=current.next;
      }
       current.next.prev=current;

      current.next=null;
     



    }
    void disp(){
        node current=head;
        while(current != null){
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("null");

    }
  public static void main(String[] args) {
      pract26 dll = new pract26();
      dll.insertAtbegin(10);
      dll.insertAtbegin(20);
      dll.insertE(30);
      dll.insertE(40);
      dll.inserAtMiddle(45, 20);
      dll.disp();
      dll.deleteAtbegin();
      dll.disp();
      dll.deleteend();
      dll.disp();
      

  }
}
