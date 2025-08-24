import java.util.*;
public class songs{
    public static int search(String[] arr,String target){
       int left=0;
       int right=arr.length;
       while(left<=right){
        int mid=(left+right)/2;
        int index=arr[mid].compareTo(target);
        if(index==0){
            return mid;
        }
        else if(index<0){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
       }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String target=sc.next();
        int a=search(arr,target);
        System.out.print(a);

    }

}