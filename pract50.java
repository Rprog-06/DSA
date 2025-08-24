import java.util.*;
public class pract50{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int incoming=sc.nextInt();
        int outgoing=sc.nextInt();
        int rust=sc.nextInt();
        int inc[]=new int[incoming];
        int out[]=new int[outgoing];
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < incoming; i++) {
            inc[i]=sc.nextInt();
            sum1+=inc[i];
        }
        for (int i = 0; i < outgoing; i++) {
            out[i]=sc.nextInt();
            sum2+=out[i];
        }
        sum1=sum1+rust;
        int factor=sum2-sum1;
        if(factor==0){
            System.out.print("Balanced");

        }
        else{
            System.out.print(factor);
        }



    }
}