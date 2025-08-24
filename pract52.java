public class pract52{
    public static void main(String[] args) {
       //it takes n steps to reach the top of the staircase
       //you can either climb 1 or 2 steps at a time
      //how many ways are there to reach the top?
       int n=5;
       int[] dp=new int[n+1];
       dp[0]=1;
       dp[1]=1;
       for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
       }
       System.out.println("Number of ways to reach the top is: "+dp[n]);
    }
      

       

}
