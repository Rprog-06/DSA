import java.util.Scanner;
public class pract9{
    public static void main(String[] args) {
        //I want to print spiral matrix
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

    
        int top=0, bottom=x-1, left=0, right=y-1;
        while(top<=bottom && left<=right){
            //print top row
            for(int i=left; i<=right; i++){
                System.out.print(mat[top][i] + " ");
            }
            top++;
            //print right column
            for(int i=top; i<=bottom; i++){
                System.out.print(mat[i][right] + " ");
            }
            right--;
            //print bottom row
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            //print left column
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}