
import java.util.Scanner;

class xyz{
    int data;
   xyz next; // Corrected the declaration of next to be of type xyz
    xyz(int data){
        this.data=data;
        this.next=null;

    }
    void display(){
        System.out.println(data);
    }
}
public class pract23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        xyz q=new xyz(n);
       
        System.out.println("The number is");
       System.out.println(q.data);

    }
}