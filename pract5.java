import java.util.*;
public class pract5{
    static int fact(int n){
       
        if(n==1){
            return 1;

        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String [] args){
        Scanner Scanner = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number to find it is strong no or not:");
        int original=Scanner.nextInt();
        int num=original;

        while(num!=0){
           int digit=num%10;
           sum+=fact(digit);
            num=num/10;
         

        }
        if(sum==original){
            System.out.println("It is a strong number");
        }
        else{
            System.out.println("It is not a strong number");
        }

    }
}