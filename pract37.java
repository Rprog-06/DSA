import java.util.*;
public class pract37{
  static int grtsum(){

    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];
    int x;
    for (int i = 0; i < 5; i++) {
        arr[i]=sc.nextInt();    
        }
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=arr[i];
            if(sum%3!=0){
                 x=sum-arr[i];

            }
        return sum;          
            
        }
          
      return -1;

    }
    public static void main(String[] args) {
        int a=grtsum();
        System.out.println(a);
    }
}