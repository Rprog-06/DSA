import java.util.*;
public class pract15{
    int binarysearch(){
         Scanner sc=new Scanner(System.in);
      System.out.print("ENTER target number");
      
      int target=sc.nextInt();
       System.out.print("ENTER size of array : ");
       int n = sc.nextInt();
      int [] arr=new int[n];
       
       
      for(int i=0;i<arr.length;i++){
          System.out.print("ENTER element "+(i+1)+" : ");
          arr[i]=sc.nextInt();}
          Arrays.sort(arr); // Ensure the array is sorted for binary search
    int low=0;
    int high=arr.length-1;
    while(low<=high){
        // int mid=(low+high)/2; // This is the traditional way, but can cause overflow
        // Using this to avoid overflow
    int mid=(low+(high-low)/2);
   
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            high=mid+1;
        }
        else{
            low=mid-1;
        }
    }
        
    
    return -1;
      
    }
    public static void main(String[] args) {
        pract15 q=new pract15();
        int s=q.binarysearch();
      if(s==-1){
        System.out.println("Element is not found");

      }
      else{
        System.out.println("Element is found at"+s );
      }
    }
}