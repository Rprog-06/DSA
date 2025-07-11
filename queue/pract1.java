
import java.util.*;

public class pract1 {

    static int rear = -1, front = -1;

   static void enqueue(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to insert");
        int x = sc.nextInt();
        if (rear == -1) {

            rear++;

            front++;
            arr[rear] = x;
        } else {
            rear++;
            arr[rear] = x;
        }


    }
    static void dequeue(int arr[]){
        if(front==-1){
           System.out.println("It is empty");
        }
         else{
           front++;
         }
    }
    static void checkfull(int arr[]){
        if(rear==arr.length-1){
            System.out.println("Queue is full");
        }
        else{
            System.out.println("Queue is not full");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        dequeue(arr);
       enqueue(arr);
       enqueue(arr);
         enqueue(arr);
         enqueue(arr);
         enqueue(arr);
         checkfull(arr);
        

       
      for (int idx = front; idx <= rear; idx++) {
          System.out.print(arr[idx]+" ");
          
      }
    }

    //QUEUE
}
