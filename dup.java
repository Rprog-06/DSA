import java.util.*;
public class dup {
    public static void main(String[] args){
    int arr[]={2,3,1,6,4,1};
    int n=arr.length-1;
    Arrays.sort(arr);

    int a=0;
    int sum=0;
    int ori=0;
    Set<Integer>st=new HashSet<>();
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
             a=arr[i];
        }
       
        st.add(arr[i]);
    }
    for(int num:st){
    ori+=num;
    }
    sum=(n*(n+1)/2);
    int s=sum-ori;
    System.out.print(a);
    System.out.print(s);
   

    }
    
}
