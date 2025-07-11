
import java.util.Scanner;

public class pract29{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    
      System.out.println("Enter numbers for fibonnaci");
      int n=sc.nextInt();
      int a=0;
      int b=1;
      int sum=0;
      for(int i=0;i<n;i++){
        sum+=a;
        int next=a+b;
        a=b;
        b=next;
      }
      System.out.println("Sum of first " + n + " Fibonacci numbers is: " + sum);
      


    }
}