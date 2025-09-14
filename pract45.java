
import java.util.Scanner;

public class pract45{
    static int rear,front=-1;
    String x;
    void insert(String arr[]){
       
       if(rear==arr.length-1){
           System.out.println("Queue is full");
       }
       else{
           rear++;
           arr[rear]=x;
       }

    }
    void delete(int arr[]){
        if(front==rear){
            System.out.println("Queue is empty");
        }
        else{
            front++;
           
        }
    }
    void display(int arr[]){
        if(front==rear){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front+1;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pract45 p = new pract45();
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[4];
        int x=4;
        for(int i=1;i<=4;i++){
            arr[i]=sc.nextInt();
            String binary[]=Integer.toBinaryString(arr[i]);
            p.insert(binary);
        }
    }
}