

import java.util.*;
public class pract33{
    
   static int happynumber(int num){
        
         int sum=0;
         while(num>0){
            int digit=num%10;  //Digit seperation
            sum+=digit*digit;  //Sum of squares 
            num=num/10;       //Reducing number
         }
         return sum;

    }
    static boolean ishappynumber(int num){
       Set<Integer> seen=new HashSet<>();  
       while(num !=1 && !seen.contains((num))) {
             seen.add(num);
             num=happynumber(num);

       }
       return num==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       if(ishappynumber(n)){
        System.out.print("It is Happy number");
       }
       else{
        System.out.print("It is not a Happy numbers");
       }
    }

}