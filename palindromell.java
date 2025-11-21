class node{
  int data;
  node next;
  node(int data){
    this.data=data;
    this.next=null;

  }
}
public class palindromell{
    static node head;
    public static void insert(int data){
       node newnode=new node(data);
        if(head ==null){
             head=newnode;
             return;
        }

        node current=head;
        while(current.next !=null){
            current=current.next;
        }
        current.next=newnode;

    }
    public static void print(node head){
        node current=head;
        while(current != null){
            System.out.print(current.data + "->");
            current=current.next;
        }
    }
    public static void main(String[] args){
       insert(1);
       insert(2);
       insert(3);
       print(head);

    }


}