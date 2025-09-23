import java.util.*;
public class hard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        int leftmax=0;
        int rightmax=0;
        int trapped=0;
        while(left<right){
          if(arr[left]<arr[right]){
                 if(arr[left]>=leftmax){
                    leftmax=arr[left];
                 }
                 else{
                    trapped+=leftmax-arr[left];
                 }
                 left++;
          }
          else{
            if(arr[right]>=rightmax){
                rightmax=arr[right];
            }
            else{
                trapped+=rightmax-arr[right];
            }
            right--;
          }
        }
    System.out.println(trapped);
    }
}
