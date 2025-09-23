import java.util.*;
public class easy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         HashMap<Integer,Integer>mp=new HashMap<>();
         int n=sc.nextInt();
        int arr[]={2,7,11,15};
        int target=9;
        for(int i=0;i<arr.length-1;i++){
            int complement=target-arr[i];
            if(mp.containsKey(complement)){
                System.out.println(mp.get(complement)+" "+i);
            }
            mp.put(arr[i],i);
        }
    }
    
}