import java.util.*;

public class pract35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the days: ");
        int days = sc.nextInt();
        System.out.print("Enter the number of products: ");
        int prod = sc.nextInt();

        int[][] arr = new int[days][prod];
        int[] res = new int[prod];

        // Input revenue for each day and product
        System.out.println("Enter the revenue matrix (days x products):");
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < prod; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display input matrix
        System.out.println("Revenue Matrix:");
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < prod; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Find max revenue for each product (column-wise max)
        for (int i = 0; i < days; i++) {
            int max = arr[i][0];
            for (int j= 1; j< prod; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            res[i] = max;
        }

        // Print results
        System.out.println("The max revenue for each product is:");
        for (int i = 0; i < days; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
