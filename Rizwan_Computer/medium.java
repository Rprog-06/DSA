import java.util.*;
public class medium {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
       int arr[][]=new int[m][n];
     
       for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            arr[i][j]=sc.nextInt();
         }
       }
       for(int i=0;i<n;i++){
        for(int j=i+1;j<m;j++){
           int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
          

        }

       }
       for (int i = 0; i < n; i++) {
          for(int j=0;j<m/2;j++){
                  int temp=arr[i][j];
                  arr[i][j]=arr[i][n-1-j];
                  arr[i][n-1-j]=temp;  
          }
          
       }
       for (int i = 0; i < 3; i++) {
           for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
           }
          System.out.println();
       }
   }   
}
