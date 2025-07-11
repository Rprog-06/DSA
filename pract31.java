import java.util.*;
public class pract31{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int []even=new int[n/2];
        int []odd=new int[n/2];
        for (int i = 0; i < n; i++) {

            arr[i]=sc.nextInt();

        }
        for(int i =0;i<n;i++){
            if(i%2==0){
             System.out.println("Even indexes are "+arr[i]);
             even[i/2]=arr[i];
            }
            else{
                System.out.println("Odd indexes are "+arr[i]);
                odd[i/2]=arr[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd); 
        // Arrays.sort(arr);
        // Arrays.sort(even);
        // Arrays.sort(odd);
        // System.out.println("Sorted array is");
        //  for (int i = 0; i < n; i++) {

        //    System.out.println(arr[i]);

        // }
        int max=even[n/2-2];
        int min=odd[n/2-2];
        int ans=max+min;
        System.out.println(ans);

      

    }
    // public int oddeven(){
       
    // }
}

