
import java.util.*;

public class pract32 {

    int majority() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("the array is");
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);

        }
        int count = 0;
        int candidate=0;
        for (int i :arr) {
           if(count==0){
            candidate=i;
           }
        if(i==candidate){ 
            count+=1;
        }
       else{
        count=-1;
       }
        }
        return candidate;
    }

    public static void main(String[] args) {
        pract32 obj = new pract32();
       int a= obj.majority();
       System.out.println("The majority element is"+a);
    }
}
