public class pract54{
    public static void main(String[] args) {
        int m=3;
        int n=2;
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0|| j==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i][j-1]+arr[i-1][j];
                }
            }
        }
        System.out.print(arr[m-1][n-1]);


    }
}