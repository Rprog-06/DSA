
import java.util.Scanner;

public class pract4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number:");
            arr[i] = sc.nextInt();

        }
        int sum=0;
        for(int j=0;j<size;j++){
           if(arr[j]%2==0){
               sum+=arr[j];
           }
          
        }
         System.out.println("Sum of even numbers is: " + sum);


    }
}// This code takes an array of integers as input and calculates the sum of even numbers in the array.
// It prompts the user to enter the size of the array and then each element of the array
