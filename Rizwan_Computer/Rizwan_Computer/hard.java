import java.util.*;

public class hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int k=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
      if (n == 0 || k == 0) {
            System.out.println(0);
            return;
        }

        // Case 1: if k >= n/2, we can do unlimited transactions
        if (k >= n / 2) {
            int profit = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > arr[i - 1]) {
                    profit += arr[i] - arr[i - 1];
                }
            }
            System.out.println(profit);
            return;
        }

        // Case 2: DP for limited transactions
        int[][] dp = new int[k + 1][n];

        for (int t = 1; t <= k; t++) {
            int maxDiff = -arr[0]; // like dp[t-1][m] - prices[m]
            for (int d = 1; d < n; d++) {
                dp[t][d] = Math.max(dp[t][d - 1], arr[d] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[t - 1][d] - arr[d]);
            }
        }

        System.out.println(dp[k][n - 1]);
    }
}
