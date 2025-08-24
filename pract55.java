public class pract55{
    public static void main(String[] args){
        int m=2;
        int n=2;
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    a[i][j]=0;
                }
                else if(i==1||j==1){
                    a[i][j]=1;
                }
                else{
                    a[i][j]=a[i][j-1]+a[i-1][j];
                }


            }
        }
        System.out.print(a[m-1][n-1]);
    }
}