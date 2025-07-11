
public class pract28 {

    static node head;

    private static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertbegin(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    void display(node current) {

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");

    }

    public void add(node l1, node l2) {
        node dummy = new node(0);
        node p = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            int digit = sum % 10;
            p.next = new node(digit);
            p = p.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        display(dummy.next);

    }

    public static void main(String[] args) {
        pract28 p = new pract28();
        node l1 = new node(2);
        l1.next = new node(4);
        l1.next.next = new node(3);
        p.display(l1);

        node l2 = new node(5);
        l2.next = new node(6);
        l2.next.next = new node(4);
        p.display(l2);
        p.add(l1, l2);

    }
}
