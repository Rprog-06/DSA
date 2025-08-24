
import java.util.*;

public class pract51 {
   static int a = Integer.MAX_VALUE;
    public static void calculate(int arr[][],int v){
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i< 3; i++) {
                for(int j=0;j<3;j++){
                    if(arr[i][k]<a && arr[k][j]<a){
                        arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);


                    }
                }
                
            }
            
        }
    }

    public static void main(String[] args) {

        
        int arr[][] = {{0, 5,2}, {a,0,1}, {a,a,0}};
        calculate(arr, a);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == a) {
                    System.out.print("INF" + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();

        }
    }
}
