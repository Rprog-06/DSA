import java.util.*;

public class pract65 {
    public static int minExitWeight(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        // Start with 1kg at (0, 0)
        dp[0][0] = Math.max(1, grid[0][0]);

        // Fill first row (can only come from left)
        for (int j = 1; j < m; j++) {
            dp[0][j] = Math.max(dp[0][j - 1], grid[0][j]);
        }

        // Fill first column (can only come from top)
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], grid[i][0]);
        }

        // Fill remaining cells
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                int fromTop = Math.max(dp[i - 1][j], grid[i][j]);
                int fromLeft = Math.max(dp[i][j - 1], grid[i][j]);
                dp[i][j] = Math.min(fromTop, fromLeft);
               
            }
        }

         return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int[][] grid1 = {
            {1, 8, 21, 7},
            {19, 17, 10, 20},
            {2, 18, 23, 22},
            {14, 25, 4, 13}
        };

        int[][] grid2 = {
            {1, 3, 6},
            {4, 5, 1},
            {3, 7, 4}
        };
        minExitWeight(grid2);
    //    System.out.println( minExitWeight(grid2));
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2.length;j++){
                System.out.print(grid2[i][j]+ " ");
            }
            System.out.println();
        }
        // System.out.println("Output 1: " + minExitWeight(grid1)); // Expected: 22
        // System.out.println("Output 2: " + minExitWeight(grid2)); // Expected: 5
    }
}