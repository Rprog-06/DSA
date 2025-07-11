

public class pract25{
    static node head;
    private static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
       public void insertAtEnd(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node current=head;
        while(current.next != null){
            current=current.next;
        }
        current.next=newnode;

       }
       public void insertAtBegin(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;

       }
       public void display(){
        node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
       }
       public static void reverse(){
        node prev=null;
        node current=head;
        node next=null;
        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
       }
       public void deletefront(){
        node current=head;
        head=head.next;
        head=current.next;
       }
       public void deleteend(){
           node current = head;
           while(current.next.next != null){
            current=current.next;
           }
           current.next=null;
       }
       public  void deletemiddle(int target){
        node current=head;
        if(current.data==target){
            head=current.next;
            return;
        }
        while(current.next != null && current.next.data != target){
            current=current.next;
        }
        if(current.next != null){
            current.next=current.next.next;
        }else{
            System.out.println("Element not found");
        }
       }
      


       
    

     public static void main(String[] args) {
           pract25 p=new pract25();
           p.insertAtEnd(20);
           p.insertAtEnd(25);
            p.insertAtEnd(35);
          p.insertAtBegin(12);
          p.deletemiddle(25);
        //  p.reverse();
         // p.deleteend();
           p.display();


}}