import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5, 5,6};
        // HashSet<Integer>st=new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     st.add(arr[i]);
        // }
        // System.out.println(st);
        int j=0;
        for(int i=0;i<arr.length-1;i++){
          
                if(arr[i] != arr[i+1]){
                 //Remove Duplicates
               
               arr[j] = arr[i];
               j++;
            }

        }
        arr[j++]=arr[arr.length-1];
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
    // }
}
}