import java.util.*;
public class pract20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {

            System.out.println("Enter elements");
            arr[i]=sc.nextInt();
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i]);
            
        // }
        // for (int i = 0; i < n; i++) {
        //     if(arr[i]==0){

        //     System.out.println(arr[i]);
        //     }
        // }
    //      for (int i = 0; i < n; i++) {
    //         if(arr[i]==0){

    //         System.out.print(arr[i]);
    //         }
    //     }
    //    for (int i = 0; i < n; i++) {
    //         if(arr[i]==1){

    //         System.out.print(arr[i]);
    //         }
    //     }
    //      for (int i = 0; i < n; i++) {
    //         if(arr[i]==2){

    //         System.out.print(arr[i]);
    //         }
    //     }
    int low=0;
    int mid=low;
    int high=arr.length-1;
    while(mid<=high){
        if(arr[mid] == 0){
               int temp=arr[low];
               arr[low]=arr[mid];
               arr[mid]=temp;
               mid++;
               low++;

        }
        else if (arr[mid]==1) {
           
            mid++;
         
            
        }
        else{
            int temp=arr[high];
            arr[high]=arr[mid];
            arr[mid]=temp;

         high--;
        
        }
    }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            
        }
      
      
    }
}