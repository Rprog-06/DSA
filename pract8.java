
import java.util.Scanner;

public class pract8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int x=sc.nextInt();
        System.out.println("Enter columns");
        int y=sc.nextInt();
        int[][] mat=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                mat[i][j]=sc.nextInt();
            }
            
        }
        for (int i = 0; i < x; i++) {
            for(int j=0;j<y;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
            
        }
int sum=0;
int cost=0;
 for (int i = 0; i < x; i++) {
           
              sum+=mat[i][i];
                cost+=mat[i][x-1-i];
 }
 //System.out.println(sum);
 System.out.println(cost);
 System.out.println(Math.abs(sum-cost));

 for

    }
}