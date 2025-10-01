
import java.util.*;
public class medium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
         for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
         }
        int sum=arr[0];
        int maxsum=arr[0];
        for(int i=0;i<n;i++){
         sum=Math.max(arr[i], sum+arr[i]);
         maxsum=Math.max(maxsum, sum);
           }
          
        
        System.out.print(maxsum);    
    }
}
