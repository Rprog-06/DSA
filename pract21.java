import  java.util.*;
public class pract21{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
        }
    //   for (int i = 0; i < n; i++) {
    //        System.out.println(arr[i]);
    //     }

        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]<arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            
        }    
        System.out.println("Enter value of K");
        int k=sc.nextInt();
        System.out.println(arr[k-1]); 

    }
}  