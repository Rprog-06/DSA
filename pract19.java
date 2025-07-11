import java.util.Scanner;
public class pract19 {
    // This class is empty, but you can add methods or properties as needed.
    // It serves as a placeholder for future implementations or extensions.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int table=0;
        int sum=0;
     for (int i = 1; i <= 10; i++) {
         table=x*i;
            sum+=table;
            


     }
        System.out.println("The sum of the table is: " + sum);} 
    }
