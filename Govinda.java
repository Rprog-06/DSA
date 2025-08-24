
import java.util.Scanner;

public class Govinda{
    public static int sum(int num){
       int sum=0;
       int temp=num;
       while(temp >0){
        sum+=temp%10;
        temp/=10;
       }
       return sum;
    }
    public static boolean check(int num){
        int factorialsum=0;
        int temp=num;
        int originalSum = sum(num);
        for(int i=2;i<=Math.sqrt(temp);i++){
            while(temp%i==0){
                factorialsum+=sum(i);
                temp/=i;
            }

        }
        if(temp>1){
            factorialsum+=sum(temp);
        }
        return temp != num && factorialsum==originalSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
       if(check(sum)){
         System.out.print("It is govinda number");
       }
       else{
        System.out.print("It is not a govinda number");
       }
    }
}